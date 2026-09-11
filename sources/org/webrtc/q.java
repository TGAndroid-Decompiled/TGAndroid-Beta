package org.webrtc;
public final class q implements Runnable {
    public final int f43614a;
    public final SurfaceTextureHelper f43615b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43614a = i10;
        this.f43615b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43614a) {
            case 0:
                this.f43615b.lambda$stopListening$1();
                return;
            case 1:
                this.f43615b.lambda$dispose$6();
                return;
            case 2:
                this.f43615b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f43615b.lambda$forceFrame$3();
                return;
        }
    }
}
