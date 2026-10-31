package org.webrtc;
public final class i implements Runnable {
    public final int f44497a;
    public final int f44498b;
    public final Object f44499c;

    public i(Object obj, int i10, int i11) {
        this.f44497a = i11;
        this.f44499c = obj;
        this.f44498b = i10;
    }

    @Override
    public final void run() {
        switch (this.f44497a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f44499c, this.f44498b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f44499c, this.f44498b);
                return;
        }
    }
}
