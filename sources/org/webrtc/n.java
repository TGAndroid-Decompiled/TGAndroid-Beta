package org.webrtc;
public final class n implements Runnable {
    public final int f43896a;
    public final RenderSynchronizer f43897b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43896a = i10;
        this.f43897b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43896a) {
            case 0:
                RenderSynchronizer.b(this.f43897b);
                return;
            default:
                RenderSynchronizer.c(this.f43897b);
                return;
        }
    }
}
