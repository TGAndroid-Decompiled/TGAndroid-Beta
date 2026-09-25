package org.webrtc;
public final class n implements Runnable {
    public final int f40637a;
    public final RenderSynchronizer f40638b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40637a = i10;
        this.f40638b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40637a) {
            case 0:
                RenderSynchronizer.b(this.f40638b);
                return;
            default:
                RenderSynchronizer.c(this.f40638b);
                return;
        }
    }
}
