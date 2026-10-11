package org.webrtc;
public final class q implements Runnable {
    public final int f45204a;
    public final SurfaceTextureHelper f45205b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f45204a = i10;
        this.f45205b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f45204a) {
            case 0:
                this.f45205b.lambda$stopListening$1();
                return;
            case 1:
                this.f45205b.lambda$dispose$6();
                return;
            case 2:
                this.f45205b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f45205b.lambda$forceFrame$3();
                return;
        }
    }
}
