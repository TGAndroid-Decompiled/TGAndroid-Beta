package org.webrtc;
public final class i implements Runnable {
    public final int f45004a;
    public final int f45005b;
    public final Object f45006c;

    public i(Object obj, int i10, int i11) {
        this.f45004a = i11;
        this.f45006c = obj;
        this.f45005b = i10;
    }

    @Override
    public final void run() {
        switch (this.f45004a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f45006c, this.f45005b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f45006c, this.f45005b);
                return;
        }
    }
}
