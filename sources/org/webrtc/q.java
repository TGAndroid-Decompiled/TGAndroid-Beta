package org.webrtc;
public final class q implements Runnable {
    public final int f39499a;
    public final SurfaceTextureHelper f39500b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f39499a = i10;
        this.f39500b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f39499a) {
            case 0:
                SurfaceTextureHelper.a(this.f39500b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f39500b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f39500b);
                return;
            default:
                SurfaceTextureHelper.e(this.f39500b);
                return;
        }
    }
}
