package org.webrtc;
public final class n implements Runnable {
    public final int f53070a;
    public final RenderSynchronizer f53071b;

    public n(RenderSynchronizer renderSynchronizer, int i7) {
        this.f53070a = i7;
        this.f53071b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f53070a) {
            case 0:
                RenderSynchronizer.b(this.f53071b);
                return;
            default:
                RenderSynchronizer.c(this.f53071b);
                return;
        }
    }
}
