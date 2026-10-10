package org.webrtc;
public final class q implements Runnable {
    public final int f45180a;
    public final SurfaceTextureHelper f45181b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f45180a = i10;
        this.f45181b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f45180a) {
            case 0:
                this.f45181b.lambda$stopListening$1();
                return;
            case 1:
                this.f45181b.lambda$dispose$6();
                return;
            case 2:
                this.f45181b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f45181b.lambda$forceFrame$3();
                return;
        }
    }
}
