package org.webrtc;
public final class p implements Runnable {
    public final int f53074a;
    public final SurfaceTextureHelper f53075b;

    public p(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f53074a = i7;
        this.f53075b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f53074a) {
            case 0:
                this.f53075b.lambda$stopListening$1();
                return;
            case 1:
                this.f53075b.lambda$dispose$6();
                return;
            case 2:
                this.f53075b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f53075b.lambda$forceFrame$3();
                return;
        }
    }
}
