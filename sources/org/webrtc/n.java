package org.webrtc;
public final class n implements Runnable {
    public final int f55090a;
    public final RenderSynchronizer f55091b;

    public n(RenderSynchronizer renderSynchronizer, int i7) {
        this.f55090a = i7;
        this.f55091b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f55090a) {
            case 0:
                RenderSynchronizer.b(this.f55091b);
                return;
            default:
                RenderSynchronizer.c(this.f55091b);
                return;
        }
    }
}
