package org.webrtc;
public final class q implements Runnable {
    public final int f40322a;
    public final SurfaceTextureHelper f40323b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40322a = i10;
        this.f40323b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40322a) {
            case 0:
                this.f40323b.lambda$stopListening$1();
                return;
            case 1:
                this.f40323b.lambda$dispose$6();
                return;
            case 2:
                this.f40323b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40323b.lambda$forceFrame$3();
                return;
        }
    }
}
