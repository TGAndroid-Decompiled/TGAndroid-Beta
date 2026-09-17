package org.webrtc;
public final class i implements Runnable {
    public final int f40381a;
    public final int f40382b;
    public final Object f40383c;

    public i(Object obj, int i10, int i11) {
        this.f40381a = i11;
        this.f40383c = obj;
        this.f40382b = i10;
    }

    @Override
    public final void run() {
        switch (this.f40381a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f40383c, this.f40382b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f40383c, this.f40382b);
                return;
        }
    }
}
