package org.webrtc;
public final class n implements Runnable {
    public final int f44058a;
    public final RenderSynchronizer f44059b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f44058a = i10;
        this.f44059b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f44058a) {
            case 0:
                RenderSynchronizer.b(this.f44059b);
                return;
            default:
                RenderSynchronizer.c(this.f44059b);
                return;
        }
    }
}
