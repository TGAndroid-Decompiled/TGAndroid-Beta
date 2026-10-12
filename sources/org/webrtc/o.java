package org.webrtc;
public final class o implements Runnable {
    public final int f42804a;
    public final RenderSynchronizer f42805b;

    public o(RenderSynchronizer renderSynchronizer, int i10) {
        this.f42804a = i10;
        this.f42805b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f42804a) {
            case 0:
                RenderSynchronizer.b(this.f42805b);
                return;
            default:
                RenderSynchronizer.c(this.f42805b);
                return;
        }
    }
}
