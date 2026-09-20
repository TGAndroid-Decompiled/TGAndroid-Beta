package org.webrtc;
public final class q implements Runnable {
    public final int f40668a;
    public final SurfaceTextureHelper f40669b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40668a = i10;
        this.f40669b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40668a) {
            case 0:
                this.f40669b.lambda$stopListening$1();
                return;
            case 1:
                this.f40669b.lambda$dispose$6();
                return;
            case 2:
                this.f40669b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40669b.lambda$forceFrame$3();
                return;
        }
    }
}
