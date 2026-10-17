package org.webrtc;
public final class i implements Runnable {
    public final int f43904a;
    public final int f43905b;
    public final Object f43906c;

    public i(Object obj, int i10, int i11) {
        this.f43904a = i11;
        this.f43906c = obj;
        this.f43905b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43904a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43906c, this.f43905b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43906c, this.f43905b);
                return;
        }
    }
}
