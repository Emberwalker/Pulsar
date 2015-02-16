package io.drakon.pulsar.test_mod;

import io.drakon.pulsar.debug.EventSpy;
import io.drakon.pulsar.internal.logging.ILogger;
import io.drakon.pulsar.internal.logging.LogManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import io.drakon.pulsar.control.PulseManager;

/**
 * Pulsar Workbench - The dev env test mod of shenanigans.
 *
 * @author Arkan <arkan@drakon.io>
 */
@SuppressWarnings("ALL")  // It's a dev env. Welcome to hacky hacky land.
@Mod(modid = "PulsarWorkbench", name = "Pulsar Workbench", version = "DEV")
public class PulsarWorkbench {

    private static PulseManager mgr;
    private static ILogger log;

    static {
        mgr = new PulseManager("PulsarWorkbench");
        log = LogManager.getLogger("PulsarWorkbench");

        mgr.registerPulse(new EventSpy());

        // Comment this out or it'll crash by design.
        //mgr.registerPulse(new CrashyAsFuckPulse());
    }

    @EventHandler
    public void preinit(FMLPreInitializationEvent evt) {
        log.info("Workbench preinit.");
    }

}
