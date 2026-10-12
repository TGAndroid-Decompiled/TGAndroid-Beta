package org.webrtc;
public final class p implements Runnable {
    public final int f45014a;
    public final ScreenCapturerAndroid f45015b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f45014a = i10;
        this.f45015b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f45014a) {
            case 0:
                ScreenCapturerAndroid.a(this.f45015b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f45015b);
                return;
        }
    }
}
