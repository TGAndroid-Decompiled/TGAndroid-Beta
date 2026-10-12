package org.webrtc;
public final class q implements Runnable {
    public final int f45016a;
    public final SurfaceTextureHelper f45017b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f45016a = i10;
        this.f45017b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f45016a) {
            case 0:
                this.f45017b.lambda$stopListening$1();
                return;
            case 1:
                this.f45017b.lambda$dispose$6();
                return;
            case 2:
                this.f45017b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f45017b.lambda$forceFrame$3();
                return;
        }
    }
}
