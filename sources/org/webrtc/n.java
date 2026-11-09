package org.webrtc;
public final class n implements Runnable {
    public final int f53071a;
    public final RenderSynchronizer f53072b;

    public n(RenderSynchronizer renderSynchronizer, int i7) {
        this.f53071a = i7;
        this.f53072b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f53071a) {
            case 0:
                RenderSynchronizer.b(this.f53072b);
                return;
            default:
                RenderSynchronizer.c(this.f53072b);
                return;
        }
    }
}
