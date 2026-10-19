package org.webrtc;
public final class i implements Runnable {
    public final int f43876a;
    public final int f43877b;
    public final Object f43878c;

    public i(Object obj, int i10, int i11) {
        this.f43876a = i11;
        this.f43878c = obj;
        this.f43877b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43876a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43878c, this.f43877b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43878c, this.f43877b);
                return;
        }
    }
}
