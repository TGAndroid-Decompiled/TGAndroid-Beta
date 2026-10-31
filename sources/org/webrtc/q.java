package org.webrtc;
public final class q implements Runnable {
    public final int f44509a;
    public final SurfaceTextureHelper f44510b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f44509a = i10;
        this.f44510b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f44509a) {
            case 0:
                SurfaceTextureHelper.a(this.f44510b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f44510b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f44510b);
                return;
            default:
                SurfaceTextureHelper.e(this.f44510b);
                return;
        }
    }
}
