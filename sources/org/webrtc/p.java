package org.webrtc;
public final class p implements Runnable {
    public final int f54479a;
    public final SurfaceTextureHelper f54480b;

    public p(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f54479a = i7;
        this.f54480b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f54479a) {
            case 0:
                SurfaceTextureHelper.a(this.f54480b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f54480b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f54480b);
                return;
            default:
                SurfaceTextureHelper.e(this.f54480b);
                return;
        }
    }
}
