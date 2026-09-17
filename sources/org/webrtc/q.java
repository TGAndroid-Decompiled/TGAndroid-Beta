package org.webrtc;
public final class q implements Runnable {
    public final int f43642a;
    public final SurfaceTextureHelper f43643b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43642a = i10;
        this.f43643b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43642a) {
            case 0:
                this.f43643b.lambda$stopListening$1();
                return;
            case 1:
                this.f43643b.lambda$dispose$6();
                return;
            case 2:
                this.f43643b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f43643b.lambda$forceFrame$3();
                return;
        }
    }
}
