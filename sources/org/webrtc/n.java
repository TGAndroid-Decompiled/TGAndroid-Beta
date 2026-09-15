package org.webrtc;
public final class n implements Runnable {
    public final int f40366a;
    public final RenderSynchronizer f40367b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40366a = i10;
        this.f40367b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40366a) {
            case 0:
                RenderSynchronizer.b(this.f40367b);
                return;
            default:
                RenderSynchronizer.c(this.f40367b);
                return;
        }
    }
}
