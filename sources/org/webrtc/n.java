package org.webrtc;
public final class n implements Runnable {
    public final int f39494a;
    public final RenderSynchronizer f39495b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f39494a = i10;
        this.f39495b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f39494a) {
            case 0:
                RenderSynchronizer.b(this.f39495b);
                return;
            default:
                RenderSynchronizer.c(this.f39495b);
                return;
        }
    }
}
