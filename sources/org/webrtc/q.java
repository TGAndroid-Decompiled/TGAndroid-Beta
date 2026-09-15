package org.webrtc;
public final class q implements Runnable {
    public final int f40371a;
    public final SurfaceTextureHelper f40372b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40371a = i10;
        this.f40372b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40371a) {
            case 0:
                this.f40372b.lambda$stopListening$1();
                return;
            case 1:
                this.f40372b.lambda$dispose$6();
                return;
            case 2:
                this.f40372b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40372b.lambda$forceFrame$3();
                return;
        }
    }
}
