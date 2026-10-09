package org.webrtc;
public final class p implements Runnable {
    public final int f45132a;
    public final ScreenCapturerAndroid f45133b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f45132a = i10;
        this.f45133b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f45132a) {
            case 0:
                ScreenCapturerAndroid.a(this.f45133b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f45133b);
                return;
        }
    }
}
