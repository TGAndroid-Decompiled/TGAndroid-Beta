package org.webrtc;
public final class p implements Runnable {
    public final int f55174a;
    public final SurfaceTextureHelper f55175b;

    public p(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f55174a = i7;
        this.f55175b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f55174a) {
            case 0:
                this.f55175b.lambda$stopListening$1();
                return;
            case 1:
                this.f55175b.lambda$dispose$6();
                return;
            case 2:
                this.f55175b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f55175b.lambda$forceFrame$3();
                return;
        }
    }
}
