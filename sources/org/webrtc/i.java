package org.webrtc;
public final class i implements Runnable {
    public final int f46485a;
    public final int f46486b;
    public final Object f46487c;

    public i(Object obj, int i10, int i11) {
        this.f46485a = i11;
        this.f46487c = obj;
        this.f46486b = i10;
    }

    @Override
    public final void run() {
        switch (this.f46485a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f46487c, this.f46486b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f46487c, this.f46486b);
                return;
        }
    }
}
