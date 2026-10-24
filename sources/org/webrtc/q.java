package org.webrtc;
public final class q implements Runnable {
    public final int f44316a;
    public final SurfaceTextureHelper f44317b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f44316a = i10;
        this.f44317b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f44316a) {
            case 0:
                this.f44317b.lambda$stopListening$1();
                return;
            case 1:
                this.f44317b.lambda$dispose$6();
                return;
            case 2:
                this.f44317b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f44317b.lambda$forceFrame$3();
                return;
        }
    }
}
