package org.webrtc;
public final class i implements Runnable {
    public final int f45192a;
    public final int f45193b;
    public final Object f45194c;

    public i(Object obj, int i10, int i11) {
        this.f45192a = i11;
        this.f45194c = obj;
        this.f45193b = i10;
    }

    @Override
    public final void run() {
        switch (this.f45192a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f45194c, this.f45193b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f45194c, this.f45193b);
                return;
        }
    }
}
