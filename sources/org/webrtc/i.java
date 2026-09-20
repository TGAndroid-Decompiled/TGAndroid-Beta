package org.webrtc;
public final class i implements Runnable {
    public final int f40656a;
    public final int f40657b;
    public final Object f40658c;

    public i(Object obj, int i10, int i11) {
        this.f40656a = i11;
        this.f40658c = obj;
        this.f40657b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40656a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40658c, this.f40657b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40658c, this.f40657b);
                return;
        }
    }
}
