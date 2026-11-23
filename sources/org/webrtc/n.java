package org.webrtc;
public final class n implements Runnable {
    public final int f55055a;
    public final RenderSynchronizer f55056b;

    public n(RenderSynchronizer renderSynchronizer, int i7) {
        this.f55055a = i7;
        this.f55056b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f55055a) {
            case 0:
                RenderSynchronizer.b(this.f55056b);
                return;
            default:
                RenderSynchronizer.c(this.f55056b);
                return;
        }
    }
}
