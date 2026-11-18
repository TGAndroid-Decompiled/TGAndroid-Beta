package org.webrtc;
public final class n implements Runnable {
    public final int f55045a;
    public final RenderSynchronizer f55046b;

    public n(RenderSynchronizer renderSynchronizer, int i7) {
        this.f55045a = i7;
        this.f55046b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f55045a) {
            case 0:
                RenderSynchronizer.b(this.f55046b);
                return;
            default:
                RenderSynchronizer.c(this.f55046b);
                return;
        }
    }
}
