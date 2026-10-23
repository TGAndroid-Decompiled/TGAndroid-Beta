package org.webrtc;
public final class n implements Runnable {
    public final int f44312a;
    public final RenderSynchronizer f44313b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f44312a = i10;
        this.f44313b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f44312a) {
            case 0:
                RenderSynchronizer.b(this.f44313b);
                return;
            default:
                RenderSynchronizer.c(this.f44313b);
                return;
        }
    }
}
