package org.webrtc;
public final class i implements Runnable {
    public final int f43890a;
    public final int f43891b;
    public final Object f43892c;

    public i(Object obj, int i10, int i11) {
        this.f43890a = i11;
        this.f43892c = obj;
        this.f43891b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43890a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43892c, this.f43891b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43892c, this.f43891b);
                return;
        }
    }
}
