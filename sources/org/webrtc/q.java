package org.webrtc;
public final class q implements Runnable {
    public final int f40740a;
    public final SurfaceTextureHelper f40741b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40740a = i10;
        this.f40741b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40740a) {
            case 0:
                this.f40741b.lambda$stopListening$1();
                return;
            case 1:
                this.f40741b.lambda$dispose$6();
                return;
            case 2:
                this.f40741b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40741b.lambda$forceFrame$3();
                return;
        }
    }
}
