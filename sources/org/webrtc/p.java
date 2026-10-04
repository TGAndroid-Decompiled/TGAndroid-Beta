package org.webrtc;
public final class p implements Runnable {
    public final int f43954a;
    public final ScreenCapturerAndroid f43955b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43954a = i10;
        this.f43955b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43954a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43955b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43955b);
                return;
        }
    }
}
