package org.webrtc;
public final class i implements Runnable {
    public final int f40359a;
    public final int f40360b;
    public final Object f40361c;

    public i(Object obj, int i10, int i11) {
        this.f40359a = i11;
        this.f40361c = obj;
        this.f40360b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40359a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40361c, this.f40360b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40361c, this.f40360b);
                return;
        }
    }
}
