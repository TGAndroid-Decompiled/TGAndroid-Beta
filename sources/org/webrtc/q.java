package org.webrtc;
public final class q implements Runnable {
    public final int f40916a;
    public final SurfaceTextureHelper f40917b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40916a = i10;
        this.f40917b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40916a) {
            case 0:
                this.f40917b.lambda$stopListening$1();
                return;
            case 1:
                this.f40917b.lambda$dispose$6();
                return;
            case 2:
                this.f40917b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40917b.lambda$forceFrame$3();
                return;
        }
    }
}
