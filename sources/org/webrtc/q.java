package org.webrtc;
public final class q implements Runnable {
    public final int f43955a;
    public final SurfaceTextureHelper f43956b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43955a = i10;
        this.f43956b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43955a) {
            case 0:
                this.f43956b.lambda$stopListening$1();
                return;
            case 1:
                this.f43956b.lambda$dispose$6();
                return;
            case 2:
                this.f43956b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f43956b.lambda$forceFrame$3();
                return;
        }
    }
}
