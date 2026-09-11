package org.webrtc;
public final class i implements Runnable {
    public final int f43602a;
    public final int f43603b;
    public final Object f43604c;

    public i(Object obj, int i10, int i11) {
        this.f43602a = i11;
        this.f43604c = obj;
        this.f43603b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43602a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43604c, this.f43603b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43604c, this.f43603b);
                return;
        }
    }
}
