package org.webrtc;
public final class n implements Runnable {
    public final int f40663a;
    public final RenderSynchronizer f40664b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40663a = i10;
        this.f40664b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40663a) {
            case 0:
                RenderSynchronizer.b(this.f40664b);
                return;
            default:
                RenderSynchronizer.c(this.f40664b);
                return;
        }
    }
}
