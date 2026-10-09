package org.webrtc;
public final class q implements Runnable {
    public final int f45134a;
    public final SurfaceTextureHelper f45135b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f45134a = i10;
        this.f45135b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f45134a) {
            case 0:
                this.f45135b.lambda$stopListening$1();
                return;
            case 1:
                this.f45135b.lambda$dispose$6();
                return;
            case 2:
                this.f45135b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f45135b.lambda$forceFrame$3();
                return;
        }
    }
}
