package org.webrtc;
public final class i implements Runnable {
    public final int f44305a;
    public final int f44306b;
    public final Object f44307c;

    public i(Object obj, int i10, int i11) {
        this.f44305a = i11;
        this.f44307c = obj;
        this.f44306b = i10;
    }

    @Override
    public final void run() {
        switch (this.f44305a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f44307c, this.f44306b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f44307c, this.f44306b);
                return;
        }
    }
}
