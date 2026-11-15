package org.webrtc;
public final class n implements Runnable {
    public final int f54476a;
    public final RenderSynchronizer f54477b;

    public n(RenderSynchronizer renderSynchronizer, int i7) {
        this.f54476a = i7;
        this.f54477b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f54476a) {
            case 0:
                RenderSynchronizer.b(this.f54477b);
                return;
            default:
                RenderSynchronizer.c(this.f54477b);
                return;
        }
    }
}
