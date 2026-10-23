package org.webrtc;
public final class q implements Runnable {
    public final int f44317a;
    public final SurfaceTextureHelper f44318b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f44317a = i10;
        this.f44318b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f44317a) {
            case 0:
                this.f44318b.lambda$stopListening$1();
                return;
            case 1:
                this.f44318b.lambda$dispose$6();
                return;
            case 2:
                this.f44318b.lambda$returnTextureFrame$5();
                return;
            default:
                this.f44318b.lambda$forceFrame$3();
                return;
        }
    }
}
