package org.webrtc;
public final class q implements Runnable {
    public final int f43641a;
    public final SurfaceTextureHelper f43642b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43641a = i10;
        this.f43642b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43641a) {
            case 0:
                this.f43642b.lambda$stopListening$1();
                return;
            case 1:
                this.f43642b.lambda$dispose$6();
                return;
            case 2:
                this.f43642b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f43642b.lambda$forceFrame$3();
                return;
        }
    }
}
