package io.drakon.pulsar.test_mod;

import com.google.common.eventbus.Subscribe;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import io.drakon.pulsar.pulse.Pulse;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;

/**
 * Test Pulse for error handling (CrashHandler)
 *
 * @author Arkan <arkan@drakon.io>
 */
@Pulse(id = "CrashyBastard", description = "This will crash. Repeatedly.")
public class CrashyAsFuckPulse {

    @Subscribe
    public void preInit(FMLPreInitializationEvent evt) {
        LogManager.getLogger("CrashyBastard").info("Got preinit evt: " + evt);
    }

    @Subscribe
    public void init(FMLInitializationEvent evt) {
        throw new RuntimeException("KAMAKAAAAAAZEEEEEE!");
    }

}
