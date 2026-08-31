package org.webrtc;
public final class p implements Runnable {
    public final int f44061a;
    public final ScreenCapturerAndroid f44062b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f44061a = i10;
        this.f44062b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f44061a) {
            case 0:
                ScreenCapturerAndroid.a(this.f44062b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f44062b);
                return;
        }
    }
}
