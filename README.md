Project Pulsar
==============

Submod loading - without the mod ID spam.

## A note on event handling
In all modern versions of Pulsar, you simply annotate your methods with `@Subscribe` (from the Guava library) and it
should just work. Pulsar forwards all FML events from the parent mod to its children, in the order the Pulses were
registered with the manager.

Note that the use of `@Subscribe` _does_ differ from the upstream Flightpath project, which uses `@Airdrop`.

Happy hacking!


## Building
Usual Gradle things apply.
```
gradle[w] setupCIWorkspace build  # Builds a release jar
gradle[w] setupDecompWorksace [idea/eclipse]  # Generates a dev env for IDEA or Eclipse.
```

## Developing
Normal Forge dev applies. Put Pulsar before Forge in the classpath to use the custom `log4j2.xml` in `devel` - This enables debug logging using Log4j2 loggers.

## Repacking
Pulsar is designed to be repackaged into other projects. Simply copy the entire tree (or just the `pulsar` package) into your project, or shade the library as below (1.7.x+/FG1.1+ only).

- To repositories add (for the official build server):
```
maven {
    name 'Tethys (drakon.io)'
    url "http://tethys.drakon.io/maven"
}
```
- Add to or create configurations block:
```
configurations {
    shade
    compile.extendsFrom shade
}
```
- Add to or create dependencies block (replacing `x.y.z` with the version you need):
```
dependencies {
    shade 'io.drakon:pulsar:x.y.z'
}
```
- Add to or create jar block:
```
jar {
    configurations.shade.each { dep ->
        from(project.zipTree(dep)){
            exclude 'META-INF', 'META-INF/**'
        }
    }
}
```
- Add srgExtra line to minecraft block:
```
srgExtra "PK: io/drakon/pulsar your/repack/package/here/pulsar"
```

**Always change the package identifier (as in the final step above with srgExtra) when repackaging to avoid namespace clashes!**
