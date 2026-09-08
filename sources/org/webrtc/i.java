package org.webrtc;
public final class i implements Runnable {
    public final int f43629a;
    public final int f43630b;
    public final Object f43631c;

    public i(Object obj, int i10, int i11) {
        this.f43629a = i11;
        this.f43631c = obj;
        this.f43630b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43629a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43631c, this.f43630b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43631c, this.f43630b);
                return;
        }
    }
}
