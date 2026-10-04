package org.webrtc;
public final class n implements Runnable {
    public final int f43958a;
    public final RenderSynchronizer f43959b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43958a = i10;
        this.f43959b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43958a) {
            case 0:
                RenderSynchronizer.b(this.f43959b);
                return;
            default:
                RenderSynchronizer.c(this.f43959b);
                return;
        }
    }
}
