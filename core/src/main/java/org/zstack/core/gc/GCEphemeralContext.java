package org.zstack.core.gc;

/**
 * Created by frank on 11/9/2015.
 */
public class GCEphemeralContext<T> extends AbstractGCContext<T> {
    private GCRunner runner;

    public GCRunner getRunner() {
        return runner;
    }

    public void setRunner(GCRunner runner) {
        this.runner = runner;
    }
}
