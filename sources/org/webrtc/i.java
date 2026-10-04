package org.webrtc;
public final class i implements Runnable {
    public final int f43951a;
    public final int f43952b;
    public final Object f43953c;

    public i(Object obj, int i10, int i11) {
        this.f43951a = i11;
        this.f43953c = obj;
        this.f43952b = i10;
    }

    @Override
    public final void run() {
        switch (this.f43951a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f43953c, this.f43952b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f43953c, this.f43952b);
                return;
        }
    }
}
