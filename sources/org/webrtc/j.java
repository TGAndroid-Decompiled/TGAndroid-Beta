package org.webrtc;
public final class j implements Runnable {
    public final int f42797a;
    public final int f42798b;
    public final Object f42799c;

    public j(Object obj, int i10, int i11) {
        this.f42797a = i11;
        this.f42799c = obj;
        this.f42798b = i10;
    }

    @Override
    public final void run() {
        switch (this.f42797a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f42799c, this.f42798b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f42799c, this.f42798b);
                return;
        }
    }
}
