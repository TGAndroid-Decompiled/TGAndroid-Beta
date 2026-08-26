package org.webrtc;

public final class ScreenCapturerAndroid$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ScreenCapturerAndroid f$0;

    public ScreenCapturerAndroid$$ExternalSyntheticLambda0(ScreenCapturerAndroid screenCapturerAndroid, int i) {
        this.$r8$classId = i;
        this.f$0 = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$changeCaptureFormat$1();
                break;
            default:
                this.f$0.lambda$stopCapture$0();
                break;
        }
    }
}
