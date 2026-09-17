package org.webrtc;
public final class q implements Runnable {
    public final int f40393a;
    public final SurfaceTextureHelper f40394b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40393a = i10;
        this.f40394b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40393a) {
            case 0:
                this.f40394b.lambda$stopListening$1();
                return;
            case 1:
                this.f40394b.lambda$dispose$6();
                return;
            case 2:
                this.f40394b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40394b.lambda$forceFrame$3();
                return;
        }
    }
}
