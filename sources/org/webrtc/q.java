package org.webrtc;
public final class q implements Runnable {
    public final int f43898a;
    public final SurfaceTextureHelper f43899b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43898a = i10;
        this.f43899b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43898a) {
            case 0:
                SurfaceTextureHelper.a(this.f43899b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f43899b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f43899b);
                return;
            default:
                SurfaceTextureHelper.e(this.f43899b);
                return;
        }
    }
}
