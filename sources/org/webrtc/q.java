package org.webrtc;
public final class q implements Runnable {
    public final int f43970a;
    public final SurfaceTextureHelper f43971b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43970a = i10;
        this.f43971b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43970a) {
            case 0:
                this.f43971b.lambda$stopListening$1();
                return;
            case 1:
                this.f43971b.lambda$dispose$6();
                return;
            case 2:
                this.f43971b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f43971b.lambda$forceFrame$3();
                return;
        }
    }
}
