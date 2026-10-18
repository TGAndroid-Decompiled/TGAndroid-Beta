package org.webrtc;
public final class i implements Runnable {
    public final int f43884a;
    public final int f43885b;
    public final Object f43886c;

    public i(Object obj, int i10, int i11) {
        this.f43884a = i11;
        this.f43886c = obj;
        this.f43885b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43884a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43886c, this.f43885b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43886c, this.f43885b);
                return;
        }
    }
}
