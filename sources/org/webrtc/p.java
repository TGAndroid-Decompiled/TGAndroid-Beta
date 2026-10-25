package org.webrtc;
public final class p implements Runnable {
    public final int f46457a;
    public final ScreenCapturerAndroid f46458b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f46457a = i10;
        this.f46458b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f46457a) {
            case 0:
                ScreenCapturerAndroid.a(this.f46458b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f46458b);
                return;
        }
    }
}
