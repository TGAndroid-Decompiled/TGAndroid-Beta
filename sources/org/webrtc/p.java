package org.webrtc;

public final class p implements Runnable {

    public final int f45316a;

    public final ScreenCapturerAndroid f45317b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f45316a = i10;
        this.f45317b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f45316a) {
            case 0:
                this.f45317b.lambda$changeCaptureFormat$1();
                break;
            default:
                this.f45317b.lambda$stopCapture$0();
                break;
        }
    }
}
