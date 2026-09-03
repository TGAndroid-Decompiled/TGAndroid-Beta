package org.webrtc;
public final class p implements Runnable {
    public final int f44092a;
    public final ScreenCapturerAndroid f44093b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f44092a = i10;
        this.f44093b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f44092a) {
            case 0:
                ScreenCapturerAndroid.a(this.f44093b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f44093b);
                return;
        }
    }
}
