package org.webrtc;
public final class n implements Runnable {
    public final int f46454a;
    public final RenderSynchronizer f46455b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f46454a = i10;
        this.f46455b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f46454a) {
            case 0:
                RenderSynchronizer.b(this.f46455b);
                return;
            default:
                RenderSynchronizer.c(this.f46455b);
                return;
        }
    }
}
