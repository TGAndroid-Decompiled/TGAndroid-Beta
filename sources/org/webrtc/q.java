package org.webrtc;
public final class q implements Runnable {
    public final int f40627a;
    public final SurfaceTextureHelper f40628b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40627a = i10;
        this.f40628b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40627a) {
            case 0:
                this.f40628b.lambda$stopListening$1();
                return;
            case 1:
                this.f40628b.lambda$dispose$6();
                return;
            case 2:
                this.f40628b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40628b.lambda$forceFrame$3();
                return;
        }
    }
}
