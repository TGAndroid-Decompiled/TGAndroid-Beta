package org.webrtc;
public final class i implements Runnable {
    public final int f44051a;
    public final int f44052b;
    public final Object f44053c;

    public i(Object obj, int i10, int i11) {
        this.f44051a = i11;
        this.f44053c = obj;
        this.f44052b = i10;
    }

    @Override
    public final void run() {
        switch (this.f44051a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f44053c, this.f44052b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f44053c, this.f44052b);
                return;
        }
    }
}
