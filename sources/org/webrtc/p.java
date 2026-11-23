package org.webrtc;
public final class p implements Runnable {
    public final int f55093a;
    public final SurfaceTextureHelper f55094b;

    public p(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f55093a = i7;
        this.f55094b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f55093a) {
            case 0:
                this.f55094b.lambda$stopListening$1();
                return;
            case 1:
                this.f55094b.lambda$dispose$6();
                return;
            case 2:
                this.f55094b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f55094b.lambda$forceFrame$3();
                return;
        }
    }
}
