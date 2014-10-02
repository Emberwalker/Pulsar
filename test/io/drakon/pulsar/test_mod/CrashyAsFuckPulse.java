package io.drakon.pulsar.test_mod;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;

/**
 * Test Pulse for error handling (CrashHandler)
 *
 * @author Arkan <arkan@drakon.io>
 */
@Pulse(id = "CrashyBastard", description = "This will crash. Repeatedly.")
public class CrashyAsFuckPulse {

    @SuppressWarnings("NumericOverflow")
    @Handler
    public void init(FMLInitializationEvent evt) {
        // KAMAKAAAAAAZEEEEEE!
        int t = 1 / 0;
    }

}
