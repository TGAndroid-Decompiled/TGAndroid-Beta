package org.webrtc;
public final class q implements Runnable {
    public final int f45136a;
    public final SurfaceTextureHelper f45137b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f45136a = i10;
        this.f45137b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f45136a) {
            case 0:
                this.f45137b.lambda$stopListening$1();
                return;
            case 1:
                this.f45137b.lambda$dispose$6();
                return;
            case 2:
                this.f45137b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f45137b.lambda$forceFrame$3();
                return;
        }
    }
}
