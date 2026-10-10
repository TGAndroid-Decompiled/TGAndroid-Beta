package org.webrtc;
public final class i implements Runnable {
    public final int f45168a;
    public final int f45169b;
    public final Object f45170c;

    public i(Object obj, int i10, int i11) {
        this.f45168a = i11;
        this.f45170c = obj;
        this.f45169b = i10;
    }

    @Override
    public final void run() {
        switch (this.f45168a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f45170c, this.f45169b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f45170c, this.f45169b);
                return;
        }
    }
}
