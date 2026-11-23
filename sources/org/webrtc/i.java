package org.webrtc;
public final class i implements Runnable {
    public final int f55164a;
    public final int f55165b;
    public final Object f55166c;

    public i(Object obj, int i7, int i10) {
        this.f55164a = i10;
        this.f55166c = obj;
        this.f55165b = i7;
    }

    @Override
    public final void run() {
        switch (this.f55164a) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.f55166c, this.f55165b);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.f55166c, this.f55165b);
                return;
        }
    }
}
