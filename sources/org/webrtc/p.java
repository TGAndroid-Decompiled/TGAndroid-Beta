package org.webrtc;
public final class p implements Runnable {
    public final int f43894a;
    public final ScreenCapturerAndroid f43895b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43894a = i10;
        this.f43895b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43894a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43895b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43895b);
                return;
        }
    }
}
