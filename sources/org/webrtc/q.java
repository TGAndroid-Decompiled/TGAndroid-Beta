package org.webrtc;
public final class q implements Runnable {
    public final int f40642a;
    public final SurfaceTextureHelper f40643b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40642a = i10;
        this.f40643b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40642a) {
            case 0:
                this.f40643b.lambda$stopListening$1();
                return;
            case 1:
                this.f40643b.lambda$dispose$6();
                return;
            case 2:
                this.f40643b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40643b.lambda$forceFrame$3();
                return;
        }
    }
}
