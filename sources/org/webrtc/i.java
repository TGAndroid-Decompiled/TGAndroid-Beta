package org.webrtc;
public final class i implements Runnable {
    public final int f55038a;
    public final int f55039b;
    public final Object f55040c;

    public i(Object obj, int i7, int i10) {
        this.f55038a = i10;
        this.f55040c = obj;
        this.f55039b = i7;
    }

    @Override
    public final void run() {
        switch (this.f55038a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f55040c, this.f55039b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f55040c, this.f55039b);
                return;
        }
    }
}
