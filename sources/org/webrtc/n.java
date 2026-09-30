package org.webrtc;
public final class n implements Runnable {
    public final int f40638a;
    public final RenderSynchronizer f40639b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40638a = i10;
        this.f40639b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40638a) {
            case 0:
                RenderSynchronizer.b(this.f40639b);
                return;
            default:
                RenderSynchronizer.c(this.f40639b);
                return;
        }
    }
}
