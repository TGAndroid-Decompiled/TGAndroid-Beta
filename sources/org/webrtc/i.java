package org.webrtc;
public final class i implements Runnable {
    public final int f52958a;
    public final int f52959b;
    public final Object f52960c;

    public i(Object obj, int i7, int i10) {
        this.f52958a = i10;
        this.f52960c = obj;
        this.f52959b = i7;
    }

    @Override
    public final void run() {
        switch (this.f52958a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f52960c, this.f52959b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f52960c, this.f52959b);
                return;
        }
    }
}
