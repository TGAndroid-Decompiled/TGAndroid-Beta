package org.webrtc;
public final class i implements Runnable {
    public final int f53049a;
    public final int f53050b;
    public final Object f53051c;

    public i(Object obj, int i7, int i10) {
        this.f53049a = i10;
        this.f53051c = obj;
        this.f53050b = i7;
    }

    @Override
    public final void run() {
        switch (this.f53049a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f53051c, this.f53050b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f53051c, this.f53050b);
                return;
        }
    }
}
