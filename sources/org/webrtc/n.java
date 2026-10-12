package org.webrtc;
public final class n implements Runnable {
    public final int f45019a;
    public final RenderSynchronizer f45020b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f45019a = i10;
        this.f45020b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f45019a) {
            case 0:
                RenderSynchronizer.b(this.f45020b);
                return;
            default:
                RenderSynchronizer.c(this.f45020b);
                return;
        }
    }
}
