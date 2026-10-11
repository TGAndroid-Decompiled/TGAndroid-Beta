package org.webrtc;
public final class q implements Runnable {
    public final int f45170a;
    public final SurfaceTextureHelper f45171b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f45170a = i10;
        this.f45171b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f45170a) {
            case 0:
                this.f45171b.lambda$stopListening$1();
                return;
            case 1:
                this.f45171b.lambda$dispose$6();
                return;
            case 2:
                this.f45171b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f45171b.lambda$forceFrame$3();
                return;
        }
    }
}
