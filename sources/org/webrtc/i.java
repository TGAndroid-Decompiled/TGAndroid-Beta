package org.webrtc;

public final class i implements Runnable {

    public final int f45306a;

    public final int f45307b;

    public final Object f45308c;

    public i(Object obj, int i10, int i11) {
        this.f45306a = i11;
        this.f45308c = obj;
        this.f45307b = i10;
    }

    @Override
    public final void run() {
        switch (this.f45306a) {
            case 0:
                ((HardwareVideoEncoder) this.f45308c).lambda$deliverEncodedImage$0(this.f45307b);
                break;
            default:
                ((SurfaceTextureHelper) this.f45308c).lambda$setFrameRotation$4(this.f45307b);
                break;
        }
    }
}
