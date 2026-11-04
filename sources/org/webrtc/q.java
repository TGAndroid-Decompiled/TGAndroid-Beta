package org.webrtc;
public final class q implements Runnable {
    public final int f53035a;
    public final SurfaceTextureHelper f53036b;

    public q(SurfaceTextureHelper surfaceTextureHelper, int i3) {
        this.f53035a = i3;
        this.f53036b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.f53035a) {
            case 0:
                SurfaceTextureHelper.a(this.f53036b);
                return;
            case 1:
                SurfaceTextureHelper.d(this.f53036b);
                return;
            case 2:
                SurfaceTextureHelper.c(this.f53036b);
                return;
            default:
                SurfaceTextureHelper.e(this.f53036b);
                return;
        }
    }
}
