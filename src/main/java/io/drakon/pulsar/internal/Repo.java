package io.drakon.pulsar.internal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Object repository.
 *
 * This should not be accessed outside of Pulsar!
 *
 * @author Arkan <arkan@drakon.io>
 */
public class Repo {

    private Repo() {}

    public static final String modId = "Pulsar";
    public static final String modName = "Project Pulsar";
    public static final String version = "@VERSION@";

    public static final Logger log = LogManager.getLogger(modName);

}
