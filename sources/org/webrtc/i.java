package org.webrtc;
public final class i implements Runnable {
    public final int f43878a;
    public final int f43879b;
    public final Object f43880c;

    public i(Object obj, int i10, int i11) {
        this.f43878a = i11;
        this.f43880c = obj;
        this.f43879b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43878a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43880c, this.f43879b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43880c, this.f43879b);
                return;
        }
    }
}
