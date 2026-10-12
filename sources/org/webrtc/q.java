package org.webrtc;
public final class q implements Runnable {
    public final int f45024a;
    public final SurfaceTextureHelper f45025b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f45024a = i10;
        this.f45025b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f45024a) {
            case 0:
                this.f45025b.lambda$stopListening$1();
                return;
            case 1:
                this.f45025b.lambda$dispose$6();
                return;
            case 2:
                this.f45025b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f45025b.lambda$forceFrame$3();
                return;
        }
    }
}
