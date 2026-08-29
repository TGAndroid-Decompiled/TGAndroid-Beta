package org.webrtc;
public final class n implements Runnable {
    public final int f45387a;
    public final RenderSynchronizer f45388b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f45387a = i10;
        this.f45388b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f45387a) {
            case 0:
                RenderSynchronizer.b(this.f45388b);
                return;
            default:
                RenderSynchronizer.c(this.f45388b);
                return;
        }
    }
}
