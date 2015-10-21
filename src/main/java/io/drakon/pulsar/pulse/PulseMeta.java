package io.drakon.pulsar.pulse;

import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.Loader;

import io.drakon.pulsar.internal.BusExceptionHandler;

/**
 * Metadata wrapper for parsed @Pulse metadata.
 *
 * @author Arkan <arkan@drakon.io>
 */
public class PulseMeta {

    private String id, description;
    private boolean forced, enabled, defaultEnabled;
    public final EventBus bus;

    public PulseMeta(String id, String description, boolean forced, boolean enabled, boolean defaultEnabled) {
        this.id = id;
        this.description = description;
        this.forced = forced;
        this.enabled = enabled;
        this.defaultEnabled = defaultEnabled;
        this.bus = new EventBus(new BusExceptionHandler(Loader.instance().activeModContainer().getModId(), id));
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isForced() {
        return forced;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isDefaultEnabled() {
        return defaultEnabled;
    }
}
