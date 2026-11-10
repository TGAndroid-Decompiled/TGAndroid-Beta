package org.webrtc;
public final class p implements Runnable {
    public final int f53073a;
    public final SurfaceTextureHelper f53074b;

    public p(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f53073a = i7;
        this.f53074b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f53073a) {
            case 0:
                this.f53074b.lambda$stopListening$1();
                return;
            case 1:
                this.f53074b.lambda$dispose$6();
                return;
            case 2:
                this.f53074b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f53074b.lambda$forceFrame$3();
                return;
        }
    }
}
