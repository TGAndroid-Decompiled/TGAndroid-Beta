package org.webrtc;
public final class p implements Runnable {
    public final int f55089a;
    public final SurfaceTextureHelper f55090b;

    public p(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f55089a = i7;
        this.f55090b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f55089a) {
            case 0:
                SurfaceTextureHelper.a(this.f55090b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f55090b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f55090b);
                return;
            default:
                SurfaceTextureHelper.e(this.f55090b);
                return;
        }
    }
}
