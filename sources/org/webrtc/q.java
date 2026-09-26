package org.webrtc;
public final class q implements Runnable {
    public final int f40641a;
    public final SurfaceTextureHelper f40642b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40641a = i10;
        this.f40642b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40641a) {
            case 0:
                this.f40642b.lambda$stopListening$1();
                return;
            case 1:
                this.f40642b.lambda$dispose$6();
                return;
            case 2:
                this.f40642b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40642b.lambda$forceFrame$3();
                return;
        }
    }
}
