package org.webrtc;
public final class i implements Runnable {
    public final int f40904a;
    public final int f40905b;
    public final Object f40906c;

    public i(Object obj, int i10, int i11) {
        this.f40904a = i11;
        this.f40906c = obj;
        this.f40905b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40904a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40906c, this.f40905b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40906c, this.f40905b);
                return;
        }
    }
}
