package org.webrtc;
public final class q implements Runnable {
    public final int f43956a;
    public final SurfaceTextureHelper f43957b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43956a = i10;
        this.f43957b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43956a) {
            case 0:
                this.f43957b.lambda$stopListening$1();
                return;
            case 1:
                this.f43957b.lambda$dispose$6();
                return;
            case 2:
                this.f43957b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f43957b.lambda$forceFrame$3();
                return;
        }
    }
}
