package io.drakon.pulsar.pulse;

/**
 * Metadata wrapper for parsed @Pulse metadata.
 *
 * @author Arkan <arkan@drakon.io>
 */
public class PulseMeta {

    private String id, description;
    private boolean forced, enabled;

    public PulseMeta(String id, String description, boolean forced, boolean enabled) {
        this.id = id;
        this.description = description;
        this.forced = forced;
        this.enabled = enabled;
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
}
