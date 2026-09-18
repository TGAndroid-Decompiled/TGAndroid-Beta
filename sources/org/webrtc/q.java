package org.webrtc;
public final class q implements Runnable {
    public final int f40398a;
    public final SurfaceTextureHelper f40399b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40398a = i10;
        this.f40399b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40398a) {
            case 0:
                this.f40399b.lambda$stopListening$1();
                return;
            case 1:
                this.f40399b.lambda$dispose$6();
                return;
            case 2:
                this.f40399b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40399b.lambda$forceFrame$3();
                return;
        }
    }
}
