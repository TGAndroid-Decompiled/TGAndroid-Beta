package org.webrtc;
public final class n implements Runnable {
    public final int f45165a;
    public final RenderSynchronizer f45166b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f45165a = i10;
        this.f45166b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f45165a) {
            case 0:
                RenderSynchronizer.b(this.f45166b);
                return;
            default:
                RenderSynchronizer.c(this.f45166b);
                return;
        }
    }
}
