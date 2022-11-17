package sample;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum Features implements Feature {

    @Label("just a description")
    @EnabledByDefault
    HELLO_WORLD,

    @Label("another description")
    REVERSE_GREETING;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}

