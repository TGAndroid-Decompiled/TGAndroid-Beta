package org.webrtc;
public final class i implements Runnable {
    public final int f40630a;
    public final int f40631b;
    public final Object f40632c;

    public i(Object obj, int i10, int i11) {
        this.f40630a = i11;
        this.f40632c = obj;
        this.f40631b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40630a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40632c, this.f40631b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40632c, this.f40631b);
                return;
        }
    }
}
