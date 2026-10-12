package org.webrtc;
public final class n implements Runnable {
    public final int f45011a;
    public final RenderSynchronizer f45012b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f45011a = i10;
        this.f45012b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f45011a) {
            case 0:
                RenderSynchronizer.b(this.f45012b);
                return;
            default:
                RenderSynchronizer.c(this.f45012b);
                return;
        }
    }
}
