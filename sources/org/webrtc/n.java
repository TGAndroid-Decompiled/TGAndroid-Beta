package org.webrtc;
public final class n implements Runnable {
    public final int f40393a;
    public final RenderSynchronizer f40394b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40393a = i10;
        this.f40394b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40393a) {
            case 0:
                RenderSynchronizer.b(this.f40394b);
                return;
            default:
                RenderSynchronizer.c(this.f40394b);
                return;
        }
    }
}
