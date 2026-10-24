package org.webrtc;
public final class i implements Runnable {
    public final int f44304a;
    public final int f44305b;
    public final Object f44306c;

    public i(Object obj, int i10, int i11) {
        this.f44304a = i11;
        this.f44306c = obj;
        this.f44305b = i10;
    }

    @Override
    public final void run() {
        switch (this.f44304a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f44306c, this.f44305b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f44306c, this.f44305b);
                return;
        }
    }
}
