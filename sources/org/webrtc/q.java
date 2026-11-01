package org.webrtc;
public final class q implements Runnable {
    public final int f44520a;
    public final SurfaceTextureHelper f44521b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f44520a = i10;
        this.f44521b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f44520a) {
            case 0:
                SurfaceTextureHelper.a(this.f44521b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f44521b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f44521b);
                return;
            default:
                SurfaceTextureHelper.e(this.f44521b);
                return;
        }
    }
}
