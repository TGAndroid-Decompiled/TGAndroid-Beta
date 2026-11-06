package org.webrtc;
public final class i implements Runnable {
    public final int f52932a;
    public final int f52933b;
    public final Object f52934c;

    public i(Object obj, int i7, int i10) {
        this.f52932a = i10;
        this.f52934c = obj;
        this.f52933b = i7;
    }

    @Override
    public final void run() {
        switch (this.f52932a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f52934c, this.f52933b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f52934c, this.f52933b);
                return;
        }
    }
}
