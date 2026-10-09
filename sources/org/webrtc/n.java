package org.webrtc;
public final class n implements Runnable {
    public final int f45129a;
    public final RenderSynchronizer f45130b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f45129a = i10;
        this.f45130b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f45129a) {
            case 0:
                RenderSynchronizer.b(this.f45130b);
                return;
            default:
                RenderSynchronizer.c(this.f45130b);
                return;
        }
    }
}
