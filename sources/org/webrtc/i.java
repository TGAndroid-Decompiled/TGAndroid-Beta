package org.webrtc;
public final class i implements Runnable {
    public final int f40310a;
    public final int f40311b;
    public final Object f40312c;

    public i(Object obj, int i10, int i11) {
        this.f40310a = i11;
        this.f40312c = obj;
        this.f40311b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40310a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40312c, this.f40311b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40312c, this.f40311b);
                return;
        }
    }
}
