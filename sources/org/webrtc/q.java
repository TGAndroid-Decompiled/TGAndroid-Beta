package org.webrtc;
public final class q implements Runnable {
    public final int f40640a;
    public final SurfaceTextureHelper f40641b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40640a = i10;
        this.f40641b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40640a) {
            case 0:
                this.f40641b.lambda$stopListening$1();
                return;
            case 1:
                this.f40641b.lambda$dispose$6();
                return;
            case 2:
                this.f40641b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40641b.lambda$forceFrame$3();
                return;
        }
    }
}
