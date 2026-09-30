package org.webrtc;
public final class i implements Runnable {
    public final int f40728a;
    public final int f40729b;
    public final Object f40730c;

    public i(Object obj, int i10, int i11) {
        this.f40728a = i11;
        this.f40730c = obj;
        this.f40729b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40728a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40730c, this.f40729b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40730c, this.f40729b);
                return;
        }
    }
}
