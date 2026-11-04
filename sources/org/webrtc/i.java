package org.webrtc;
public final class i implements Runnable {
    public final int f53023a;
    public final int f53024b;
    public final Object f53025c;

    public i(Object obj, int i3, int i10) {
        this.f53023a = i10;
        this.f53025c = obj;
        this.f53024b = i3;
    }

    @Override
    public final void run() {
        switch (this.f53023a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f53025c, this.f53024b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f53025c, this.f53024b);
                return;
        }
    }
}
