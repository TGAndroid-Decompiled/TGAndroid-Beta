package org.webrtc;
public final class n implements Runnable {
    public final int f40735a;
    public final RenderSynchronizer f40736b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40735a = i10;
        this.f40736b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40735a) {
            case 0:
                RenderSynchronizer.b(this.f40736b);
                return;
            default:
                RenderSynchronizer.c(this.f40736b);
                return;
        }
    }
}
