package org.webrtc;
public final class q implements Runnable {
    public final int f43963a;
    public final SurfaceTextureHelper f43964b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43963a = i10;
        this.f43964b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43963a) {
            case 0:
                this.f43964b.lambda$stopListening$1();
                return;
            case 1:
                this.f43964b.lambda$dispose$6();
                return;
            case 2:
                this.f43964b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f43964b.lambda$forceFrame$3();
                return;
        }
    }
}
