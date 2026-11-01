package org.webrtc;
public final class n implements Runnable {
    public final int f44515a;
    public final RenderSynchronizer f44516b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f44515a = i10;
        this.f44516b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f44515a) {
            case 0:
                RenderSynchronizer.b(this.f44516b);
                return;
            default:
                RenderSynchronizer.c(this.f44516b);
                return;
        }
    }
}
