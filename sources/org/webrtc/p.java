package org.webrtc;
public final class p implements Runnable {
    public final int f45168a;
    public final ScreenCapturerAndroid f45169b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f45168a = i10;
        this.f45169b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f45168a) {
            case 0:
                ScreenCapturerAndroid.a(this.f45169b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f45169b);
                return;
        }
    }
}
