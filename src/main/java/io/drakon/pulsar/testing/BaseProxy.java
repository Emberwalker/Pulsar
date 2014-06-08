package io.drakon.pulsar.testing;

import io.drakon.pulsar.internal.Repo;

/**
 * Test rig - Common proxy
 *
 * @author Arkan <arkan@drakon.io>
 */
public class BaseProxy {

    public BaseProxy() {
        Repo.log.info("[Test Rig] Common proxy constructed.");
    }

}
