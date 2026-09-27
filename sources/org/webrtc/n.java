package org.webrtc;
public final class n implements Runnable {
    public final int f40634a;
    public final RenderSynchronizer f40635b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f40634a = i10;
        this.f40635b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f40634a) {
            case 0:
                RenderSynchronizer.b(this.f40635b);
                return;
            default:
                RenderSynchronizer.c(this.f40635b);
                return;
        }
    }
}
