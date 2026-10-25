package org.webrtc;
public final class i implements Runnable {
    public final int f46447a;
    public final int f46448b;
    public final Object f46449c;

    public i(Object obj, int i10, int i11) {
        this.f46447a = i11;
        this.f46449c = obj;
        this.f46448b = i10;
    }

    @Override
    public final void run() {
        switch (this.f46447a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f46449c, this.f46448b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f46449c, this.f46448b);
                return;
        }
    }
}
