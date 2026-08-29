package org.webrtc;
public final class i implements Runnable {
    public final int f45380a;
    public final int f45381b;
    public final Object f45382c;

    public i(Object obj, int i10, int i11) {
        this.f45380a = i11;
        this.f45382c = obj;
        this.f45381b = i10;
    }

    @Override
    public final void run() {
        switch (this.f45380a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f45382c, this.f45381b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f45382c, this.f45381b);
                return;
        }
    }
}
