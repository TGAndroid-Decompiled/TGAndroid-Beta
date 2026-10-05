package org.webrtc;
public final class i implements Runnable {
    public final int f43958a;
    public final int f43959b;
    public final Object f43960c;

    public i(Object obj, int i10, int i11) {
        this.f43958a = i11;
        this.f43960c = obj;
        this.f43959b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43958a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43960c, this.f43959b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43960c, this.f43959b);
                return;
        }
    }
}
