package org.webrtc;

public final class n implements Runnable {

    public final int f45313a;

    public final RenderSynchronizer f45314b;

    public n(RenderSynchronizer renderSynchronizer, int i10) {
        this.f45313a = i10;
        this.f45314b = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.f45313a) {
            case 0:
                this.f45314b.lambda$registerListener$1();
                break;
            default:
                this.f45314b.lambda$new$0();
                break;
        }
    }
}
