package io.drakon.pulsar.testing;

import io.drakon.pulsar.internal.Repo;

/**
 * Test rig - Client proxy
 *
 * @author Arkan <arkan@drakon.io>
 */
public class ClientProxy extends BaseProxy {

    public ClientProxy() {
        Repo.log.info("[Test Rig] Client proxy constructed.");
    }

}
