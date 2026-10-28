package org.webrtc;
public final class q implements Runnable {
    public final int f46497a;
    public final SurfaceTextureHelper f46498b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f46497a = i10;
        this.f46498b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f46497a) {
            case 0:
                this.f46498b.lambda$stopListening$1();
                return;
            case 1:
                this.f46498b.lambda$dispose$6();
                return;
            case 2:
                this.f46498b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f46498b.lambda$forceFrame$3();
                return;
        }
    }
}
