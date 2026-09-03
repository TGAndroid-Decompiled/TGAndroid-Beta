package org.webrtc;
public final class i implements Runnable {
    public final int f40926a;
    public final int f40927b;
    public final Object f40928c;

    public i(Object obj, int i10, int i11) {
        this.f40926a = i11;
        this.f40928c = obj;
        this.f40927b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40926a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40928c, this.f40927b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40928c, this.f40927b);
                return;
        }
    }
}
