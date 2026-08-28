package org.webrtc;
public final class q implements Runnable {
    public final int f45312a;
    public final SurfaceTextureHelper f45313b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i9) {
        this.f45312a = i9;
        this.f45313b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f45312a) {
            case 0:
                SurfaceTextureHelper.a(this.f45313b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f45313b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f45313b);
                return;
            default:
                SurfaceTextureHelper.e(this.f45313b);
                return;
        }
    }
}
