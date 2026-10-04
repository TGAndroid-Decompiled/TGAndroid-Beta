package org.webrtc;
public final class i implements Runnable {
    public final int f43943a;
    public final int f43944b;
    public final Object f43945c;

    public i(Object obj, int i10, int i11) {
        this.f43943a = i11;
        this.f43945c = obj;
        this.f43944b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43943a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43945c, this.f43944b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43945c, this.f43944b);
                return;
        }
    }
}
