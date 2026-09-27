package org.webrtc;
public final class q implements Runnable {
    public final int f40639a;
    public final SurfaceTextureHelper f40640b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40639a = i10;
        this.f40640b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40639a) {
            case 0:
                this.f40640b.lambda$stopListening$1();
                return;
            case 1:
                this.f40640b.lambda$dispose$6();
                return;
            case 2:
                this.f40640b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40640b.lambda$forceFrame$3();
                return;
        }
    }
}
