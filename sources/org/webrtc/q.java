package org.webrtc;
public final class q implements Runnable {
    public final int f40367a;
    public final SurfaceTextureHelper f40368b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40367a = i10;
        this.f40368b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40367a) {
            case 0:
                this.f40368b.lambda$stopListening$1();
                return;
            case 1:
                this.f40368b.lambda$dispose$6();
                return;
            case 2:
                this.f40368b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40368b.lambda$forceFrame$3();
                return;
        }
    }
}
