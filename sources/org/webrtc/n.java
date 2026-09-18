package org.webrtc;
public final class n implements Runnable {
    public final int f40622a;
    public final RenderSynchronizer f40623b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40622a = i10;
        this.f40623b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40622a) {
            case 0:
                RenderSynchronizer.b(this.f40623b);
                return;
            default:
                RenderSynchronizer.c(this.f40623b);
                return;
        }
    }
}
