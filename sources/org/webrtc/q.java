package org.webrtc;
public final class q implements Runnable {
    public final int f53061a;
    public final SurfaceTextureHelper f53062b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f53061a = i7;
        this.f53062b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f53061a) {
            case 0:
                SurfaceTextureHelper.a(this.f53062b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f53062b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f53062b);
                return;
            default:
                SurfaceTextureHelper.e(this.f53062b);
                return;
        }
    }
}
