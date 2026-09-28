package org.webrtc;
public final class i implements Runnable {
    public final int f40629a;
    public final int f40630b;
    public final Object f40631c;

    public i(Object obj, int i10, int i11) {
        this.f40629a = i11;
        this.f40631c = obj;
        this.f40630b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40629a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40631c, this.f40630b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40631c, this.f40630b);
                return;
        }
    }
}
