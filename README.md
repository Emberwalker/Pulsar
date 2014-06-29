Project Pulsar
==============

Submod loading - without the mod ID spam.

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
    name 'Drakon.io Arca'
    url "http://arca.drakon.io/"
}
```
- Add to or create configurations block:
```
configurations {
    shade
    compile.extendsFrom shade
}
```
- Add to or create dependencies block:
```
dependencies {
    shade 'io.drakon:Pulsar:0.0.1'
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
