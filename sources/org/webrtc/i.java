package org.webrtc;
public final class i implements Runnable {
    public final int f43924a;
    public final int f43925b;
    public final Object f43926c;

    public i(Object obj, int i10, int i11) {
        this.f43924a = i11;
        this.f43926c = obj;
        this.f43925b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43924a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43926c, this.f43925b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43926c, this.f43925b);
                return;
        }
    }
}
