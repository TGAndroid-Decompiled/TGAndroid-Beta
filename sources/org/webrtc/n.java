package org.webrtc;
public final class n implements Runnable {
    public final int f40684a;
    public final RenderSynchronizer f40685b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40684a = i10;
        this.f40685b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40684a) {
            case 0:
                RenderSynchronizer.b(this.f40685b);
                return;
            default:
                RenderSynchronizer.c(this.f40685b);
                return;
        }
    }
}
