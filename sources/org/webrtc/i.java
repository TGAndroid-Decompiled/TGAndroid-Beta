package org.webrtc;
public final class i implements Runnable {
    public final int f45300a;
    public final int f45301b;
    public final Object f45302c;

    public i(Object obj, int i9, int i10) {
        this.f45300a = i10;
        this.f45302c = obj;
        this.f45301b = i9;
    }

    @Override
    public final void run() {
        switch (this.f45300a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f45302c, this.f45301b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f45302c, this.f45301b);
                return;
        }
    }
}
