package org.webrtc;
public final class q implements Runnable {
    public final int f44094a;
    public final SurfaceTextureHelper f44095b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f44094a = i10;
        this.f44095b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f44094a) {
            case 0:
                this.f44095b.lambda$stopListening$1();
                return;
            case 1:
                this.f44095b.lambda$dispose$6();
                return;
            case 2:
                this.f44095b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f44095b.lambda$forceFrame$3();
                return;
        }
    }
}
