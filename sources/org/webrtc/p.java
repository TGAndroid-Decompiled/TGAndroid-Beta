package org.webrtc;
public final class p implements Runnable {
    public final int f43961a;
    public final ScreenCapturerAndroid f43962b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43961a = i10;
        this.f43962b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43961a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43962b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43962b);
                return;
        }
    }
}
