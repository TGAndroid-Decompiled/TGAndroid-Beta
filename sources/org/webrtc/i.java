package org.webrtc;
public final class i implements Runnable {
    public final int f45122a;
    public final int f45123b;
    public final Object f45124c;

    public i(Object obj, int i10, int i11) {
        this.f45122a = i11;
        this.f45124c = obj;
        this.f45123b = i10;
    }

    @Override
    public final void run() {
        switch (this.f45122a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f45124c, this.f45123b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f45124c, this.f45123b);
                return;
        }
    }
}
