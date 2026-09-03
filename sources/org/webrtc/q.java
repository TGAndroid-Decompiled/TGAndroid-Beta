package org.webrtc;
public final class q implements Runnable {
    public final int f40938a;
    public final SurfaceTextureHelper f40939b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40938a = i10;
        this.f40939b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40938a) {
            case 0:
                this.f40939b.lambda$stopListening$1();
                return;
            case 1:
                this.f40939b.lambda$dispose$6();
                return;
            case 2:
                this.f40939b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40939b.lambda$forceFrame$3();
                return;
        }
    }
}
