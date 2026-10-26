package org.webrtc;
public final class n implements Runnable {
    public final int f46457a;
    public final RenderSynchronizer f46458b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f46457a = i10;
        this.f46458b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f46457a) {
            case 0:
                RenderSynchronizer.b(this.f46458b);
                return;
            default:
                RenderSynchronizer.c(this.f46458b);
                return;
        }
    }
}
