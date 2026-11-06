package org.webrtc;
public final class n implements Runnable {
    public final int f52963a;
    public final RenderSynchronizer f52964b;

    public n(RenderSynchronizer renderSynchronizer, int i7) {
        this.f52963a = i7;
        this.f52964b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f52963a) {
            case 0:
                RenderSynchronizer.b(this.f52964b);
                return;
            default:
                RenderSynchronizer.c(this.f52964b);
                return;
        }
    }
}
