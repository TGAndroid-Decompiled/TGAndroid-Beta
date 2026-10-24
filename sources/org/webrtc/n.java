package org.webrtc;
public final class n implements Runnable {
    public final int f44311a;
    public final RenderSynchronizer f44312b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f44311a = i10;
        this.f44312b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f44311a) {
            case 0:
                RenderSynchronizer.b(this.f44312b);
                return;
            default:
                RenderSynchronizer.c(this.f44312b);
                return;
        }
    }
}
