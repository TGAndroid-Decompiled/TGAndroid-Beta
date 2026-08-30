package org.webrtc;
public final class n implements Runnable {
    public final int f40911a;
    public final RenderSynchronizer f40912b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40911a = i10;
        this.f40912b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40911a) {
            case 0:
                RenderSynchronizer.b(this.f40912b);
                return;
            default:
                RenderSynchronizer.c(this.f40912b);
                return;
        }
    }
}
