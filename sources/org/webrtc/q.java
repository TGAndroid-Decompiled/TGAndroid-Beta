package org.webrtc;
public final class q implements Runnable {
    public final int f45392a;
    public final SurfaceTextureHelper f45393b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f45392a = i10;
        this.f45393b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f45392a) {
            case 0:
                this.f45393b.lambda$stopListening$1();
                return;
            case 1:
                this.f45393b.lambda$dispose$6();
                return;
            case 2:
                this.f45393b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f45393b.lambda$forceFrame$3();
                return;
        }
    }
}
