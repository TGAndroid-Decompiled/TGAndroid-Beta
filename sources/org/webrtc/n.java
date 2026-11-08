package org.webrtc;
public final class n implements Runnable {
    public final int f53057a;
    public final RenderSynchronizer f53058b;

    public n(RenderSynchronizer renderSynchronizer, int i7) {
        this.f53057a = i7;
        this.f53058b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f53057a) {
            case 0:
                RenderSynchronizer.b(this.f53058b);
                return;
            default:
                RenderSynchronizer.c(this.f53058b);
                return;
        }
    }
}
