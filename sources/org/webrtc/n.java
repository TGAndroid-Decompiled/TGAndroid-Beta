package org.webrtc;
public final class n implements Runnable {
    public final int f40636a;
    public final RenderSynchronizer f40637b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40636a = i10;
        this.f40637b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40636a) {
            case 0:
                RenderSynchronizer.b(this.f40637b);
                return;
            default:
                RenderSynchronizer.c(this.f40637b);
                return;
        }
    }
}
