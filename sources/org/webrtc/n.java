package org.webrtc;
public final class n implements Runnable {
    public final int f43636a;
    public final RenderSynchronizer f43637b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43636a = i10;
        this.f43637b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43636a) {
            case 0:
                RenderSynchronizer.b(this.f43637b);
                return;
            default:
                RenderSynchronizer.c(this.f43637b);
                return;
        }
    }
}
