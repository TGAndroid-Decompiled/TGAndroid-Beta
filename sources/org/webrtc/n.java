package org.webrtc;
public final class n implements Runnable {
    public final int f44504a;
    public final RenderSynchronizer f44505b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f44504a = i10;
        this.f44505b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f44504a) {
            case 0:
                RenderSynchronizer.b(this.f44505b);
                return;
            default:
                RenderSynchronizer.c(this.f44505b);
                return;
        }
    }
}
