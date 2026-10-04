package org.webrtc;
public final class i implements Runnable {
    public final int f43944a;
    public final int f43945b;
    public final Object f43946c;

    public i(Object obj, int i10, int i11) {
        this.f43944a = i11;
        this.f43946c = obj;
        this.f43945b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43944a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43946c, this.f43945b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43946c, this.f43945b);
                return;
        }
    }
}
