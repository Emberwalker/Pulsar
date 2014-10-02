package io.drakon.pulsar.test_mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.drakon.pulsar.control.PulseManager;

/**
 * Pulsar Workbench - The dev env test mod of shenanigans.
 *
 * @author Arkan <arkan@drakon.io>
 */
@Mod(modid = "PulsarWorkbench", name = "Pulsar Workbench", version = "DEV")
public class PulsarWorkbench {

    private PulseManager mgr;

    @EventHandler
    public void preinit(FMLPreInitializationEvent evt) {
        mgr = new PulseManager("PulsarWorkbench", "PulsarWorkbench");

        // Comment this out or it'll crash by design.
        mgr.registerPulse(new CrashyAsFuckPulse());

        mgr.preInit(evt);
    }

    @EventHandler
    public void init(FMLInitializationEvent evt) {
        mgr.init(evt);
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent evt) {
        mgr.postInit(evt);
    }

}
