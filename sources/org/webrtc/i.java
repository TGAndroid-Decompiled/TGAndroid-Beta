package org.webrtc;
public final class i implements Runnable {
    public final int f43630a;
    public final int f43631b;
    public final Object f43632c;

    public i(Object obj, int i10, int i11) {
        this.f43630a = i11;
        this.f43632c = obj;
        this.f43631b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43630a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43632c, this.f43631b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43632c, this.f43631b);
                return;
        }
    }
}
