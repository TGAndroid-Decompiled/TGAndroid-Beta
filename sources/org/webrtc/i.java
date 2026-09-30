package org.webrtc;
public final class i implements Runnable {
    public final int f40631a;
    public final int f40632b;
    public final Object f40633c;

    public i(Object obj, int i10, int i11) {
        this.f40631a = i11;
        this.f40633c = obj;
        this.f40632b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40631a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40633c, this.f40632b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40633c, this.f40632b);
                return;
        }
    }
}
