package org.webrtc;
public final class n implements Runnable {
    public final int f43893a;
    public final RenderSynchronizer f43894b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43893a = i10;
        this.f43894b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43893a) {
            case 0:
                RenderSynchronizer.b(this.f43894b);
                return;
            default:
                RenderSynchronizer.c(this.f43894b);
                return;
        }
    }
}
