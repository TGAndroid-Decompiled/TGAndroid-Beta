package org.webrtc;
public final class i implements Runnable {
    public final int f43886a;
    public final int f43887b;
    public final Object f43888c;

    public i(Object obj, int i10, int i11) {
        this.f43886a = i11;
        this.f43888c = obj;
        this.f43887b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43886a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43888c, this.f43887b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43888c, this.f43887b);
                return;
        }
    }
}
