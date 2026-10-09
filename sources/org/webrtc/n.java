package org.webrtc;
public final class n implements Runnable {
    public final int f45131a;
    public final RenderSynchronizer f45132b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f45131a = i10;
        this.f45132b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f45131a) {
            case 0:
                RenderSynchronizer.b(this.f45132b);
                return;
            default:
                RenderSynchronizer.c(this.f45132b);
                return;
        }
    }
}
