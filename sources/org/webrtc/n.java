package org.webrtc;
public final class n implements Runnable {
    public final int f43885a;
    public final RenderSynchronizer f43886b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43885a = i10;
        this.f43886b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43885a) {
            case 0:
                RenderSynchronizer.b(this.f43886b);
                return;
            default:
                RenderSynchronizer.c(this.f43886b);
                return;
        }
    }
}
