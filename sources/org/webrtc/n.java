package org.webrtc;
public final class n implements Runnable {
    public final int f43891a;
    public final RenderSynchronizer f43892b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43891a = i10;
        this.f43892b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43891a) {
            case 0:
                RenderSynchronizer.b(this.f43892b);
                return;
            default:
                RenderSynchronizer.c(this.f43892b);
                return;
        }
    }
}
