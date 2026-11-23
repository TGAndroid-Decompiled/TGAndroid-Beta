package org.webrtc;
public final class i implements Runnable {
    public final int f55048a;
    public final int f55049b;
    public final Object f55050c;

    public i(Object obj, int i7, int i10) {
        this.f55048a = i10;
        this.f55050c = obj;
        this.f55049b = i7;
    }

    @Override
    public final void run() {
        switch (this.f55048a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f55050c, this.f55049b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f55050c, this.f55049b);
                return;
        }
    }
}
