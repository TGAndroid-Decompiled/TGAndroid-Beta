package org.webrtc;
public final class q implements Runnable {
    public final int f46497a;
    public final SurfaceTextureHelper f46498b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f46497a = i10;
        this.f46498b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f46497a) {
            case 0:
                SurfaceTextureHelper.a(this.f46498b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f46498b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f46498b);
                return;
            default:
                SurfaceTextureHelper.e(this.f46498b);
                return;
        }
    }
}
