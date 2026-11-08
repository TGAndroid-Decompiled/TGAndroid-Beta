package org.webrtc;
public final class q implements Runnable {
    public final int f53062a;
    public final SurfaceTextureHelper f53063b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f53062a = i7;
        this.f53063b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f53062a) {
            case 0:
                this.f53063b.lambda$stopListening$1();
                return;
            case 1:
                this.f53063b.lambda$dispose$6();
                return;
            case 2:
                this.f53063b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f53063b.lambda$forceFrame$3();
                return;
        }
    }
}
