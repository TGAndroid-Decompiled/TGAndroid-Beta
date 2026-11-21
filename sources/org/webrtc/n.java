package org.webrtc;
public final class n implements Runnable {
    public final int f55086a;
    public final RenderSynchronizer f55087b;

    public n(RenderSynchronizer renderSynchronizer, int i7) {
        this.f55086a = i7;
        this.f55087b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f55086a) {
            case 0:
                RenderSynchronizer.b(this.f55087b);
                return;
            default:
                RenderSynchronizer.c(this.f55087b);
                return;
        }
    }
}
