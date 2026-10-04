package org.webrtc;
public final class n implements Runnable {
    public final int f43950a;
    public final RenderSynchronizer f43951b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43950a = i10;
        this.f43951b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43950a) {
            case 0:
                RenderSynchronizer.b(this.f43951b);
                return;
            default:
                RenderSynchronizer.c(this.f43951b);
                return;
        }
    }
}
