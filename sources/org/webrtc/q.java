package org.webrtc;
public final class q implements Runnable {
    public final int f43898a;
    public final SurfaceTextureHelper f43899b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43898a = i10;
        this.f43899b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43898a) {
            case 0:
                this.f43899b.lambda$stopListening$1();
                return;
            case 1:
                this.f43899b.lambda$dispose$6();
                return;
            case 2:
                this.f43899b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f43899b.lambda$forceFrame$3();
                return;
        }
    }
}
