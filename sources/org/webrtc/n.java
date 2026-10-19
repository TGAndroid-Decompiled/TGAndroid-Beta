package org.webrtc;
public final class n implements Runnable {
    public final int f43883a;
    public final RenderSynchronizer f43884b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43883a = i10;
        this.f43884b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43883a) {
            case 0:
                RenderSynchronizer.b(this.f43884b);
                return;
            default:
                RenderSynchronizer.c(this.f43884b);
                return;
        }
    }
}
