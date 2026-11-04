package org.webrtc;
public final class n implements Runnable {
    public final int f53030a;
    public final RenderSynchronizer f53031b;

    public n(RenderSynchronizer renderSynchronizer, int i3) {
        this.f53030a = i3;
        this.f53031b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f53030a) {
            case 0:
                RenderSynchronizer.b(this.f53031b);
                return;
            default:
                RenderSynchronizer.c(this.f53031b);
                return;
        }
    }
}
