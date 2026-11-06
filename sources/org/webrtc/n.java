package org.webrtc;
public final class n implements Runnable {
    public final int f52965a;
    public final RenderSynchronizer f52966b;

    public n(RenderSynchronizer renderSynchronizer, int i7) {
        this.f52965a = i7;
        this.f52966b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f52965a) {
            case 0:
                RenderSynchronizer.b(this.f52966b);
                return;
            default:
                RenderSynchronizer.c(this.f52966b);
                return;
        }
    }
}
