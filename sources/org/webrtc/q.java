package org.webrtc;
public final class q implements Runnable {
    public final int f43888a;
    public final SurfaceTextureHelper f43889b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43888a = i10;
        this.f43889b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43888a) {
            case 0:
                this.f43889b.lambda$stopListening$1();
                return;
            case 1:
                this.f43889b.lambda$dispose$6();
                return;
            case 2:
                this.f43889b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f43889b.lambda$forceFrame$3();
                return;
        }
    }
}
