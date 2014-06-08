package io.drakon.pulsar;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.drakon.pulsar.control.PulseManager;
import static io.drakon.pulsar.internal.Repo.*;

/**
 * Project Pulsar - The in-mod component loader.
 *
 * @author Arkan <arkan@drakon.io>
 */
@Mod(modid = modId, name = modName, version = version, modLanguage = "java")
public class Pulsar {

    private final PulseManager mgr = new PulseManager(modId);

    @EventHandler
    public void preInit(FMLPreInitializationEvent evt) {
        log.info("Initialising...");
        //mgr.registerPulse(new TestPulse());
        mgr.preInit(evt);
    }

    @EventHandler
    public void init(FMLInitializationEvent evt) {
        mgr.init(evt);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent evt) {
        mgr.postInit(evt);
        log.info("Initialisation complete.");
    }

}
