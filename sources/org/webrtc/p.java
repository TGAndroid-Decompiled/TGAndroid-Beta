package org.webrtc;
public final class p implements Runnable {
    public final int f55048a;
    public final SurfaceTextureHelper f55049b;

    public p(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f55048a = i7;
        this.f55049b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f55048a) {
            case 0:
                SurfaceTextureHelper.a(this.f55049b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f55049b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f55049b);
                return;
            default:
                SurfaceTextureHelper.e(this.f55049b);
                return;
        }
    }
}
