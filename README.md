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
Pulsar is designed to be repackaged into other projects. Simply copy the entire tree (or just the `pulsar` package) into your project, or shade the library (instructions coming Soon(tm)).

**Always change the package identifier when repackaging to avoid namespace clashes!**
