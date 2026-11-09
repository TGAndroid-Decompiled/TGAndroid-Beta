package org.webrtc;
public final class i implements Runnable {
    public final int f53064a;
    public final int f53065b;
    public final Object f53066c;

    public i(Object obj, int i7, int i10) {
        this.f53064a = i10;
        this.f53066c = obj;
        this.f53065b = i7;
    }

    @Override
    public final void run() {
        switch (this.f53064a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f53066c, this.f53065b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f53066c, this.f53065b);
                return;
        }
    }
}
