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
Pulsar is designed to be repackaged into other projects. To do this, remove the following classes:
```
io.drakon.pulsar.Pulsar
io.drakon.pulsar.testing.*
io.drakon.pulsar.internal.Repo
```

This may leave some dangling references for the logger, replace these as needed.

**Always change the package identifier when repackaging to avoid namespace clashes!**
