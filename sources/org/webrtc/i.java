package org.webrtc;
public final class i implements Runnable {
    public final int f40628a;
    public final int f40629b;
    public final Object f40630c;

    public i(Object obj, int i10, int i11) {
        this.f40628a = i11;
        this.f40630c = obj;
        this.f40629b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40628a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40630c, this.f40629b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40630c, this.f40629b);
                return;
        }
    }
}
