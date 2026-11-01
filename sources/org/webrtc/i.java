package org.webrtc;
public final class i implements Runnable {
    public final int f44508a;
    public final int f44509b;
    public final Object f44510c;

    public i(Object obj, int i10, int i11) {
        this.f44508a = i11;
        this.f44510c = obj;
        this.f44509b = i10;
    }

    @Override
    public final void run() {
        switch (this.f44508a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f44510c, this.f44509b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f44510c, this.f44509b);
                return;
        }
    }
}
