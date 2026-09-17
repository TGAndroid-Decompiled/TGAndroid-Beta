package org.webrtc;
public final class n implements Runnable {
    public final int f43637a;
    public final RenderSynchronizer f43638b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43637a = i10;
        this.f43638b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43637a) {
            case 0:
                RenderSynchronizer.b(this.f43638b);
                return;
            default:
                RenderSynchronizer.c(this.f43638b);
                return;
        }
    }
}
