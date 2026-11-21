package org.webrtc;
public final class i implements Runnable {
    public final int f55079a;
    public final int f55080b;
    public final Object f55081c;

    public i(Object obj, int i7, int i10) {
        this.f55079a = i10;
        this.f55081c = obj;
        this.f55080b = i7;
    }

    @Override
    public final void run() {
        switch (this.f55079a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f55081c, this.f55080b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f55081c, this.f55080b);
                return;
        }
    }
}
