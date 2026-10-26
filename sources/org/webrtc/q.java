package org.webrtc;
public final class q implements Runnable {
    public final int f46462a;
    public final SurfaceTextureHelper f46463b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f46462a = i10;
        this.f46463b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f46462a) {
            case 0:
                this.f46463b.lambda$stopListening$1();
                return;
            case 1:
                this.f46463b.lambda$dispose$6();
                return;
            case 2:
                this.f46463b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f46463b.lambda$forceFrame$3();
                return;
        }
    }
}
