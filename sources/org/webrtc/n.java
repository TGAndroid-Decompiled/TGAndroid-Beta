package org.webrtc;
public final class n implements Runnable {
    public final int f43965a;
    public final RenderSynchronizer f43966b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43965a = i10;
        this.f43966b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43965a) {
            case 0:
                RenderSynchronizer.b(this.f43966b);
                return;
            default:
                RenderSynchronizer.c(this.f43966b);
                return;
        }
    }
}
