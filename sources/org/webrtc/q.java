package org.webrtc;
public final class q implements Runnable {
    public final int f42509a;
    public final SurfaceTextureHelper f42510b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f42509a = i10;
        this.f42510b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f42509a) {
            case 0:
                this.f42510b.lambda$stopListening$1();
                return;
            case 1:
                this.f42510b.lambda$dispose$6();
                return;
            case 2:
                this.f42510b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f42510b.lambda$forceFrame$3();
                return;
        }
    }
}
