package org.webrtc;
public final class p implements Runnable {
    public final int f44314a;
    public final ScreenCapturerAndroid f44315b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f44314a = i10;
        this.f44315b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f44314a) {
            case 0:
                ScreenCapturerAndroid.a(this.f44315b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f44315b);
                return;
        }
    }
}
