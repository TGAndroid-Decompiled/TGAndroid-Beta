package org.webrtc;
public final class q implements Runnable {
    public final int f43615a;
    public final SurfaceTextureHelper f43616b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43615a = i10;
        this.f43616b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43615a) {
            case 0:
                this.f43616b.lambda$stopListening$1();
                return;
            case 1:
                this.f43616b.lambda$dispose$6();
                return;
            case 2:
                this.f43616b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f43616b.lambda$forceFrame$3();
                return;
        }
    }
}
