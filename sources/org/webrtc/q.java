package org.webrtc;
public final class q implements Runnable {
    public final int f43901a;
    public final SurfaceTextureHelper f43902b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43901a = i10;
        this.f43902b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43901a) {
            case 0:
                this.f43902b.lambda$stopListening$1();
                return;
            case 1:
                this.f43902b.lambda$dispose$6();
                return;
            case 2:
                this.f43902b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f43902b.lambda$forceFrame$3();
                return;
        }
    }
}
