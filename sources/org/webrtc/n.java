package org.webrtc;
public final class n implements Runnable {
    public final int f46492a;
    public final RenderSynchronizer f46493b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f46492a = i10;
        this.f46493b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f46492a) {
            case 0:
                RenderSynchronizer.b(this.f46493b);
                return;
            default:
                RenderSynchronizer.c(this.f46493b);
                return;
        }
    }
}
