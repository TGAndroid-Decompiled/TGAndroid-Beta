package org.webrtc;
public final class p implements Runnable {
    public final int f43613a;
    public final ScreenCapturerAndroid f43614b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43613a = i10;
        this.f43614b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43613a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43614b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43614b);
                return;
        }
    }
}
