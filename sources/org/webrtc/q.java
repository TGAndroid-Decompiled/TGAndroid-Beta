package org.webrtc;

public final class q implements Runnable {

    public final int f45318a;

    public final SurfaceTextureHelper f45319b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f45318a = i10;
        this.f45319b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f45318a) {
            case 0:
                this.f45319b.lambda$stopListening$1();
                break;
            case 1:
                this.f45319b.lambda$dispose$6();
                break;
            case 2:
                this.f45319b.lambda$returnTextureFrame$5();
                break;
            default:
                this.f45319b.lambda$forceFrame$3();
                break;
        }
    }
}
