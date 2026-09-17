package org.webrtc;
public final class n implements Runnable {
    public final int f40388a;
    public final RenderSynchronizer f40389b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40388a = i10;
        this.f40389b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40388a) {
            case 0:
                RenderSynchronizer.b(this.f40389b);
                return;
            default:
                RenderSynchronizer.c(this.f40389b);
                return;
        }
    }
}
