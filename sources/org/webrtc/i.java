package org.webrtc;
public final class i implements Runnable {
    public final int f55083a;
    public final int f55084b;
    public final Object f55085c;

    public i(Object obj, int i7, int i10) {
        this.f55083a = i10;
        this.f55085c = obj;
        this.f55084b = i7;
    }

    @Override
    public final void run() {
        switch (this.f55083a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f55085c, this.f55084b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f55085c, this.f55084b);
                return;
        }
    }
}
