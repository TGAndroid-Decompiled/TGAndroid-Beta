package org.webrtc;
public final class n implements Runnable {
    public final int f43897a;
    public final RenderSynchronizer f43898b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43897a = i10;
        this.f43898b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43897a) {
            case 0:
                RenderSynchronizer.b(this.f43898b);
                return;
            default:
                RenderSynchronizer.c(this.f43898b);
                return;
        }
    }
}
