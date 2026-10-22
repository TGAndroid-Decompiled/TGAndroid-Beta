package org.webrtc;
public final class i implements Runnable {
    public final int f43889a;
    public final int f43890b;
    public final Object f43891c;

    public i(Object obj, int i10, int i11) {
        this.f43889a = i11;
        this.f43891c = obj;
        this.f43890b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43889a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43891c, this.f43890b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43891c, this.f43890b);
                return;
        }
    }
}
