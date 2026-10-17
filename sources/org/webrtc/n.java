package org.webrtc;
public final class n implements Runnable {
    public final int f43911a;
    public final RenderSynchronizer f43912b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43911a = i10;
        this.f43912b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43911a) {
            case 0:
                RenderSynchronizer.b(this.f43912b);
                return;
            default:
                RenderSynchronizer.c(this.f43912b);
                return;
        }
    }
}
