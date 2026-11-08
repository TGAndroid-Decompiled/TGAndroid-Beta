package org.webrtc;
public final class n implements Runnable {
    public final int f53056a;
    public final RenderSynchronizer f53057b;

    public n(RenderSynchronizer renderSynchronizer, int i7) {
        this.f53056a = i7;
        this.f53057b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f53056a) {
            case 0:
                RenderSynchronizer.b(this.f53057b);
                return;
            default:
                RenderSynchronizer.c(this.f53057b);
                return;
        }
    }
}
