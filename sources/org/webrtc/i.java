package org.webrtc;
public final class i implements Runnable {
    public final int f43603a;
    public final int f43604b;
    public final Object f43605c;

    public i(Object obj, int i10, int i11) {
        this.f43603a = i11;
        this.f43605c = obj;
        this.f43604b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43603a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43605c, this.f43604b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43605c, this.f43604b);
                return;
        }
    }
}
