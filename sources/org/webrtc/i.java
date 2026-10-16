package org.webrtc;
public final class i implements Runnable {
    public final int f42497a;
    public final int f42498b;
    public final Object f42499c;

    public i(Object obj, int i10, int i11) {
        this.f42497a = i11;
        this.f42499c = obj;
        this.f42498b = i10;
    }

    @Override
    public final void run() {
        switch (this.f42497a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f42499c, this.f42498b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f42499c, this.f42498b);
                return;
        }
    }
}
