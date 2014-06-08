package io.drakon.pulsar.testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.drakon.pulsar.pulse.IPulse;
import io.drakon.pulsar.pulse.Pulse;
import io.drakon.pulsar.pulse.PulseProxy;

/**
 * Test rig Pulse.
 *
 * @author Arkan <arkan@drakon.io>
 */
@Pulse(id = "testRig")
public class TestPulse implements IPulse {

    @PulseProxy(client = "io.drakon.pulsar.testing.ClientProxy", server = "io.drakon.pulsar.testing.BaseProxy")
    private BaseProxy proxy = null;

    private final Logger log = LogManager.getLogger();

    @Override
    public void preInit(FMLPreInitializationEvent evt) {
        log.info("Can has proxy? " + proxy);
    }

    @Override
    public void init(FMLInitializationEvent evt) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent evt) {

    }
}
