package org.webrtc;
public final class q implements Runnable {
    public final int f52968a;
    public final SurfaceTextureHelper f52969b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f52968a = i7;
        this.f52969b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f52968a) {
            case 0:
                this.f52969b.lambda$stopListening$1();
                return;
            case 1:
                this.f52969b.lambda$dispose$6();
                return;
            case 2:
                this.f52969b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f52969b.lambda$forceFrame$3();
                return;
        }
    }
}
