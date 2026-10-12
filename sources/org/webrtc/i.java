package org.webrtc;
public final class i implements Runnable {
    public final int f45012a;
    public final int f45013b;
    public final Object f45014c;

    public i(Object obj, int i10, int i11) {
        this.f45012a = i11;
        this.f45014c = obj;
        this.f45013b = i10;
    }

    @Override
    public final void run() {
        switch (this.f45012a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f45014c, this.f45013b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f45014c, this.f45013b);
                return;
        }
    }
}
