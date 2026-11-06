package org.webrtc;
public final class i implements Runnable {
    public final int f52956a;
    public final int f52957b;
    public final Object f52958c;

    public i(Object obj, int i7, int i10) {
        this.f52956a = i10;
        this.f52958c = obj;
        this.f52957b = i7;
    }

    @Override
    public final void run() {
        switch (this.f52956a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f52958c, this.f52957b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f52958c, this.f52957b);
                return;
        }
    }
}
