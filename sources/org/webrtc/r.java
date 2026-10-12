package org.webrtc;
public final class r implements Runnable {
    public final int f42809a;
    public final SurfaceTextureHelper f42810b;

    public r(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f42809a = i10;
        this.f42810b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f42809a) {
            case 0:
                SurfaceTextureHelper.a(this.f42810b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f42810b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f42810b);
                return;
            default:
                SurfaceTextureHelper.e(this.f42810b);
                return;
        }
    }
}
