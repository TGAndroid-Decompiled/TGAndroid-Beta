package org.webrtc;
public final class n implements Runnable {
    public final int f44089a;
    public final RenderSynchronizer f44090b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f44089a = i10;
        this.f44090b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f44089a) {
            case 0:
                RenderSynchronizer.b(this.f44090b);
                return;
            default:
                RenderSynchronizer.c(this.f44090b);
                return;
        }
    }
}
