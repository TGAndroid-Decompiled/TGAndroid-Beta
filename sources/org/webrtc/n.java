package org.webrtc;
public final class n implements Runnable {
    public final int f43951a;
    public final RenderSynchronizer f43952b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f43951a = i10;
        this.f43952b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f43951a) {
            case 0:
                RenderSynchronizer.b(this.f43952b);
                return;
            default:
                RenderSynchronizer.c(this.f43952b);
                return;
        }
    }
}
