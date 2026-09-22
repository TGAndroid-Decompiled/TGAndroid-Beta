package org.webrtc;
public final class i implements Runnable {
    public final int f40355a;
    public final int f40356b;
    public final Object f40357c;

    public i(Object obj, int i10, int i11) {
        this.f40355a = i11;
        this.f40357c = obj;
        this.f40356b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40355a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40357c, this.f40356b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40357c, this.f40356b);
                return;
        }
    }
}
