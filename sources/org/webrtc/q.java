package org.webrtc;
public final class q implements Runnable {
    public final int f45312a;
    public final SurfaceTextureHelper f45313b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i9) {
        this.f45312a = i9;
        this.f45313b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f45312a) {
            case 0:
                this.f45313b.lambda$stopListening$1();
                return;
            case 1:
                this.f45313b.lambda$dispose$6();
                return;
            case 2:
                this.f45313b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f45313b.lambda$forceFrame$3();
                return;
        }
    }
}
