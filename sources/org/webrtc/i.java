package org.webrtc;
public final class i implements Runnable {
    public final int f54469a;
    public final int f54470b;
    public final Object f54471c;

    public i(Object obj, int i7, int i10) {
        this.f54469a = i10;
        this.f54471c = obj;
        this.f54470b = i7;
    }

    @Override
    public final void run() {
        switch (this.f54469a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f54471c, this.f54470b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f54471c, this.f54470b);
                return;
        }
    }
}
