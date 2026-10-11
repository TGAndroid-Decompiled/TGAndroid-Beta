package org.webrtc;
public final class i implements Runnable {
    public final int f45158a;
    public final int f45159b;
    public final Object f45160c;

    public i(Object obj, int i10, int i11) {
        this.f45158a = i11;
        this.f45160c = obj;
        this.f45159b = i10;
    }

    @Override
    public final void run() {
        switch (this.f45158a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f45160c, this.f45159b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f45160c, this.f45159b);
                return;
        }
    }
}
