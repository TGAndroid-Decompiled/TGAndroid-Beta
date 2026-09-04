package org.webrtc;
public final class n implements Runnable {
    public final int f43609a;
    public final RenderSynchronizer f43610b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43609a = i10;
        this.f43610b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43609a) {
            case 0:
                RenderSynchronizer.b(this.f43610b);
                return;
            default:
                RenderSynchronizer.c(this.f43610b);
                return;
        }
    }
}
