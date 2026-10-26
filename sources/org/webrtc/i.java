package org.webrtc;
public final class i implements Runnable {
    public final int f46450a;
    public final int f46451b;
    public final Object f46452c;

    public i(Object obj, int i10, int i11) {
        this.f46450a = i11;
        this.f46452c = obj;
        this.f46451b = i10;
    }

    @Override
    public final void run() {
        switch (this.f46450a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f46452c, this.f46451b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f46452c, this.f46451b);
                return;
        }
    }
}
