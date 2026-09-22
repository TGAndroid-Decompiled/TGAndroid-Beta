package org.webrtc;
public final class n implements Runnable {
    public final int f40362a;
    public final RenderSynchronizer f40363b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40362a = i10;
        this.f40363b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40362a) {
            case 0:
                RenderSynchronizer.b(this.f40363b);
                return;
            default:
                RenderSynchronizer.c(this.f40363b);
                return;
        }
    }
}
