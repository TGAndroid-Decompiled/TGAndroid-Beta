package org.webrtc;
public final class p implements Runnable {
    public final int f55058a;
    public final SurfaceTextureHelper f55059b;

    public p(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f55058a = i7;
        this.f55059b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f55058a) {
            case 0:
                SurfaceTextureHelper.a(this.f55059b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f55059b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f55059b);
                return;
            default:
                SurfaceTextureHelper.e(this.f55059b);
                return;
        }
    }
}
