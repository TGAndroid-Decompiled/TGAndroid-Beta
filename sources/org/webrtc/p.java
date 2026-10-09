package org.webrtc;
public final class p implements Runnable {
    public final int f45134a;
    public final ScreenCapturerAndroid f45135b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f45134a = i10;
        this.f45135b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f45134a) {
            case 0:
                ScreenCapturerAndroid.a(this.f45135b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f45135b);
                return;
        }
    }
}
