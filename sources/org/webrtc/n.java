package org.webrtc;
public final class n implements Runnable {
    public final int f45175a;
    public final RenderSynchronizer f45176b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f45175a = i10;
        this.f45176b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f45175a) {
            case 0:
                RenderSynchronizer.b(this.f45176b);
                return;
            default:
                RenderSynchronizer.c(this.f45176b);
                return;
        }
    }
}
