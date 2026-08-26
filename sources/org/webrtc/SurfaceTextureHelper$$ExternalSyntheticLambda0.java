package org.webrtc;

public final class SurfaceTextureHelper$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final SurfaceTextureHelper f$0;

    public SurfaceTextureHelper$$ExternalSyntheticLambda0(SurfaceTextureHelper surfaceTextureHelper, int i) {
        this.$r8$classId = i;
        this.f$0 = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$stopListening$1();
                break;
            case 1:
                this.f$0.lambda$dispose$6();
                break;
            case 2:
                this.f$0.lambda$returnTextureFrame$5();
                break;
            default:
                this.f$0.lambda$forceFrame$3();
                break;
        }
    }
}
