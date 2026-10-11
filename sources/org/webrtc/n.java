package org.webrtc;
public final class n implements Runnable {
    public final int f45199a;
    public final RenderSynchronizer f45200b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f45199a = i10;
        this.f45200b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f45199a) {
            case 0:
                RenderSynchronizer.b(this.f45200b);
                return;
            default:
                RenderSynchronizer.c(this.f45200b);
                return;
        }
    }
}
