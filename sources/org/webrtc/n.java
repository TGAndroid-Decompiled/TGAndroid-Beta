package org.webrtc;
public final class n implements Runnable {
    public final int f45307a;
    public final RenderSynchronizer f45308b;

    public n(RenderSynchronizer renderSynchronizer, int i9) {
        this.f45307a = i9;
        this.f45308b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f45307a) {
            case 0:
                RenderSynchronizer.b(this.f45308b);
                return;
            default:
                RenderSynchronizer.c(this.f45308b);
                return;
        }
    }
}
