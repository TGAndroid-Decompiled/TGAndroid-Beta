package org.webrtc;
public final class i implements Runnable {
    public final int f39487a;
    public final int f39488b;
    public final Object f39489c;

    public i(Object obj, int i10, int i11) {
        this.f39487a = i11;
        this.f39489c = obj;
        this.f39488b = i10;
    }

    @Override
    public final void run() {
        switch (this.f39487a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f39489c, this.f39488b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f39489c, this.f39488b);
                return;
        }
    }
}
