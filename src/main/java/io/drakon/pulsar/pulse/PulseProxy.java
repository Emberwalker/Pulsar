package io.drakon.pulsar.pulse;

import java.lang.annotation.*;

/**
 * Annotation to denote a field that should be populated by a side-specific proxy.
 *
 * @deprecated Use FML's @SidedProxy instead.
 *
 * @author Arkan <arkan@drakon.io>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
@Deprecated
public @interface PulseProxy {

    /**
     * @return The FQCN of the client proxy.
     */
    public String client();

    /**
     * @return The FQCN of the server proxy.
     */
    public String server();

}
