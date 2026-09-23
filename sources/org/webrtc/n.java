package org.webrtc;
public final class n implements Runnable {
    public final int f40317a;
    public final RenderSynchronizer f40318b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40317a = i10;
        this.f40318b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40317a) {
            case 0:
                RenderSynchronizer.b(this.f40318b);
                return;
            default:
                RenderSynchronizer.c(this.f40318b);
                return;
        }
    }
}
