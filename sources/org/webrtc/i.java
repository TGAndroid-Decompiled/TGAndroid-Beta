package org.webrtc;
public final class i implements Runnable {
    public final int f40627a;
    public final int f40628b;
    public final Object f40629c;

    public i(Object obj, int i10, int i11) {
        this.f40627a = i11;
        this.f40629c = obj;
        this.f40628b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40627a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40629c, this.f40628b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40629c, this.f40628b);
                return;
        }
    }
}
