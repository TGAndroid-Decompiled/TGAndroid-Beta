package org.webrtc;
public final class q implements Runnable {
    public final int f40689a;
    public final SurfaceTextureHelper f40690b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f40689a = i10;
        this.f40690b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f40689a) {
            case 0:
                this.f40690b.lambda$stopListening$1();
                return;
            case 1:
                this.f40690b.lambda$dispose$6();
                return;
            case 2:
                this.f40690b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f40690b.lambda$forceFrame$3();
                return;
        }
    }
}
