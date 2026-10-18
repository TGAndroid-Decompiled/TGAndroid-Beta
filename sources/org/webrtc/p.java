package org.webrtc;
public final class p implements Runnable {
    public final int f43934a;
    public final ScreenCapturerAndroid f43935b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43934a = i10;
        this.f43935b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43934a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43935b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43935b);
                return;
        }
    }
}
