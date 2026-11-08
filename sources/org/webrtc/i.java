package org.webrtc;
public final class i implements Runnable {
    public final int f53050a;
    public final int f53051b;
    public final Object f53052c;

    public i(Object obj, int i7, int i10) {
        this.f53050a = i10;
        this.f53052c = obj;
        this.f53051b = i7;
    }

    @Override
    public final void run() {
        switch (this.f53050a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f53052c, this.f53051b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f53052c, this.f53051b);
                return;
        }
    }
}
