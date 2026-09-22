package org.webrtc;
public final class i implements Runnable {
    public final int f40677a;
    public final int f40678b;
    public final Object f40679c;

    public i(Object obj, int i10, int i11) {
        this.f40677a = i11;
        this.f40679c = obj;
        this.f40678b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40677a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40679c, this.f40678b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40679c, this.f40678b);
                return;
        }
    }
}
