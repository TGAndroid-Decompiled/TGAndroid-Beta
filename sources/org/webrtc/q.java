package org.webrtc;
public final class q implements Runnable {
    public final int f44063a;
    public final SurfaceTextureHelper f44064b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f44063a = i10;
        this.f44064b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f44063a) {
            case 0:
                this.f44064b.lambda$stopListening$1();
                return;
            case 1:
                this.f44064b.lambda$dispose$6();
                return;
            case 2:
                this.f44064b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f44064b.lambda$forceFrame$3();
                return;
        }
    }
}
