package org.webrtc;
public final class i implements Runnable {
    public final int f45124a;
    public final int f45125b;
    public final Object f45126c;

    public i(Object obj, int i10, int i11) {
        this.f45124a = i11;
        this.f45126c = obj;
        this.f45125b = i10;
    }

    @Override
    public final void run() {
        switch (this.f45124a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f45126c, this.f45125b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f45126c, this.f45125b);
                return;
        }
    }
}
