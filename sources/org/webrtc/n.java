package org.webrtc;
public final class n implements Runnable {
    public final int f40635a;
    public final RenderSynchronizer f40636b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40635a = i10;
        this.f40636b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40635a) {
            case 0:
                RenderSynchronizer.b(this.f40636b);
                return;
            default:
                RenderSynchronizer.c(this.f40636b);
                return;
        }
    }
}
