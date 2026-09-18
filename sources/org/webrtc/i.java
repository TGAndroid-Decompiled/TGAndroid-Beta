package org.webrtc;
public final class i implements Runnable {
    public final int f40615a;
    public final int f40616b;
    public final Object f40617c;

    public i(Object obj, int i10, int i11) {
        this.f40615a = i11;
        this.f40617c = obj;
        this.f40616b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40615a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40617c, this.f40616b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40617c, this.f40616b);
                return;
        }
    }
}
