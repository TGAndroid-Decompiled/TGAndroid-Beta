package org.webrtc;
public final class n implements Runnable {
    public final int f42504a;
    public final RenderSynchronizer f42505b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f42504a = i10;
        this.f42505b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f42504a) {
            case 0:
                RenderSynchronizer.b(this.f42505b);
                return;
            default:
                RenderSynchronizer.c(this.f42505b);
                return;
        }
    }
}
