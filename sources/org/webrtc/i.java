package org.webrtc;
public final class i implements Runnable {
    public final int f53063a;
    public final int f53064b;
    public final Object f53065c;

    public i(Object obj, int i7, int i10) {
        this.f53063a = i10;
        this.f53065c = obj;
        this.f53064b = i7;
    }

    @Override
    public final void run() {
        switch (this.f53063a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f53065c, this.f53064b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f53065c, this.f53064b);
                return;
        }
    }
}
