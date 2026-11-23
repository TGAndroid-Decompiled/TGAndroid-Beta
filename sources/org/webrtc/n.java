package org.webrtc;
public final class n implements Runnable {
    public final int f55171a;
    public final RenderSynchronizer f55172b;

    public n(RenderSynchronizer renderSynchronizer, int i7) {
        this.f55171a = i7;
        this.f55172b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f55171a) {
            case 0:
                RenderSynchronizer.b(this.f55172b);
                return;
            default:
                RenderSynchronizer.c(this.f55172b);
                return;
        }
    }
}
