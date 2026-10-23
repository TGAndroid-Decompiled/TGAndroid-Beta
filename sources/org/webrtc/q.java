package org.webrtc;
public final class q implements Runnable {
    public final int f43902a;
    public final SurfaceTextureHelper f43903b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43902a = i10;
        this.f43903b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43902a) {
            case 0:
                this.f43903b.lambda$stopListening$1();
                return;
            case 1:
                this.f43903b.lambda$dispose$6();
                return;
            case 2:
                this.f43903b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f43903b.lambda$forceFrame$3();
                return;
        }
    }
}
