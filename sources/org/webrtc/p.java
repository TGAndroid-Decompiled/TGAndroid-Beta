package org.webrtc;
public final class p implements Runnable {
    public final int f55048a;
    public final SurfaceTextureHelper f55049b;

    public p(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f55048a = i7;
        this.f55049b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f55048a) {
            case 0:
                this.f55049b.lambda$stopListening$1();
                return;
            case 1:
                this.f55049b.lambda$dispose$6();
                return;
            case 2:
                this.f55049b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f55049b.lambda$forceFrame$3();
                return;
        }
    }
}
