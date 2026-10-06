package org.webrtc;
public final class q implements Runnable {
    public final int f43970a;
    public final SurfaceTextureHelper f43971b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43970a = i10;
        this.f43971b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43970a) {
            case 0:
                SurfaceTextureHelper.a(this.f43971b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f43971b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f43971b);
                return;
            default:
                SurfaceTextureHelper.e(this.f43971b);
                return;
        }
    }
}
