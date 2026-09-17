package org.webrtc;
public final class n implements Runnable {
    public final int f43610a;
    public final RenderSynchronizer f43611b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43610a = i10;
        this.f43611b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43610a) {
            case 0:
                RenderSynchronizer.b(this.f43611b);
                return;
            default:
                RenderSynchronizer.c(this.f43611b);
                return;
        }
    }
}
