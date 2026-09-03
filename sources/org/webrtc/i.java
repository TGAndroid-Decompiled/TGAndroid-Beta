package org.webrtc;
public final class i implements Runnable {
    public final int f44082a;
    public final int f44083b;
    public final Object f44084c;

    public i(Object obj, int i10, int i11) {
        this.f44082a = i11;
        this.f44084c = obj;
        this.f44083b = i10;
    }

    @Override
    public final void run() {
        switch (this.f44082a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f44084c, this.f44083b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f44084c, this.f44083b);
                return;
        }
    }
}
