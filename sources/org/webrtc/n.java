package org.webrtc;
public final class n implements Runnable {
    public final int f52939a;
    public final RenderSynchronizer f52940b;

    public n(RenderSynchronizer renderSynchronizer, int i7) {
        this.f52939a = i7;
        this.f52940b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f52939a) {
            case 0:
                RenderSynchronizer.b(this.f52940b);
                return;
            default:
                RenderSynchronizer.c(this.f52940b);
                return;
        }
    }
}
