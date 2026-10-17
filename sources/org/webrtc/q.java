package org.webrtc;
public final class q implements Runnable {
    public final int f43916a;
    public final SurfaceTextureHelper f43917b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f43916a = i10;
        this.f43917b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f43916a) {
            case 0:
                SurfaceTextureHelper.a(this.f43917b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f43917b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f43917b);
                return;
            default:
                SurfaceTextureHelper.e(this.f43917b);
                return;
        }
    }
}
