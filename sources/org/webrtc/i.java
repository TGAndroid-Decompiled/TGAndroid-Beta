package org.webrtc;
public final class i implements Runnable {
    public final int f40386a;
    public final int f40387b;
    public final Object f40388c;

    public i(Object obj, int i10, int i11) {
        this.f40386a = i11;
        this.f40388c = obj;
        this.f40387b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40386a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40388c, this.f40387b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40388c, this.f40387b);
                return;
        }
    }
}
