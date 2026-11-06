package org.webrtc;
public final class q implements Runnable {
    public final int f52944a;
    public final SurfaceTextureHelper f52945b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f52944a = i7;
        this.f52945b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f52944a) {
            case 0:
                this.f52945b.lambda$stopListening$1();
                return;
            case 1:
                this.f52945b.lambda$dispose$6();
                return;
            case 2:
                this.f52945b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f52945b.lambda$forceFrame$3();
                return;
        }
    }
}
