package org.webrtc;
public final class q implements Runnable {
    public final int f43936a;
    public final SurfaceTextureHelper f43937b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43936a = i10;
        this.f43937b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43936a) {
            case 0:
                this.f43937b.lambda$stopListening$1();
                return;
            case 1:
                this.f43937b.lambda$dispose$6();
                return;
            case 2:
                this.f43937b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f43937b.lambda$forceFrame$3();
                return;
        }
    }
}
