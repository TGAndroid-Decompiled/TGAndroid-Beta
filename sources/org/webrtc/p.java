package org.webrtc;
public final class p implements Runnable {
    public final int f45202a;
    public final ScreenCapturerAndroid f45203b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f45202a = i10;
        this.f45203b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f45202a) {
            case 0:
                ScreenCapturerAndroid.a(this.f45203b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f45203b);
                return;
        }
    }
}
