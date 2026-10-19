package org.webrtc;
public final class q implements Runnable {
    public final int f43890a;
    public final SurfaceTextureHelper f43891b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43890a = i10;
        this.f43891b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43890a) {
            case 0:
                SurfaceTextureHelper.a(this.f43891b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f43891b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f43891b);
                return;
            default:
                SurfaceTextureHelper.e(this.f43891b);
                return;
        }
    }
}
