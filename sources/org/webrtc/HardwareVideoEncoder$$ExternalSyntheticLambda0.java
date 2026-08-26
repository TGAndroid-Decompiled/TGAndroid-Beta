package org.webrtc;

public final class HardwareVideoEncoder$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public HardwareVideoEncoder$$ExternalSyntheticLambda0(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((HardwareVideoEncoder) this.f$0).lambda$deliverEncodedImage$0(this.f$1);
                break;
            default:
                ((SurfaceTextureHelper) this.f$0).lambda$setFrameRotation$4(this.f$1);
                break;
        }
    }
}
