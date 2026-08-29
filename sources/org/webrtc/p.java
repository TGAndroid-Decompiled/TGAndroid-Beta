package org.webrtc;
public final class p implements Runnable {
    public final int f45390a;
    public final ScreenCapturerAndroid f45391b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f45390a = i10;
        this.f45391b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f45390a) {
            case 0:
                ScreenCapturerAndroid.a(this.f45391b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f45391b);
                return;
        }
    }
}
