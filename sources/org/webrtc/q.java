package org.webrtc;
public final class q implements Runnable {
    public final int f52970a;
    public final SurfaceTextureHelper f52971b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f52970a = i7;
        this.f52971b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f52970a) {
            case 0:
                SurfaceTextureHelper.a(this.f52971b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f52971b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f52971b);
                return;
            default:
                SurfaceTextureHelper.e(this.f52971b);
                return;
        }
    }
}
