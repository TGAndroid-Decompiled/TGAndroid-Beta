package org.webrtc;
public final class n implements Runnable {
    public final int f40933a;
    public final RenderSynchronizer f40934b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40933a = i10;
        this.f40934b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40933a) {
            case 0:
                RenderSynchronizer.b(this.f40934b);
                return;
            default:
                RenderSynchronizer.c(this.f40934b);
                return;
        }
    }
}
