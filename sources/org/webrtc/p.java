package org.webrtc;
public final class p implements Runnable {
    public final int f45310a;
    public final ScreenCapturerAndroid f45311b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i9) {
        this.f45310a = i9;
        this.f45311b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f45310a) {
            case 0:
                ScreenCapturerAndroid.a(this.f45311b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f45311b);
                return;
        }
    }
}
