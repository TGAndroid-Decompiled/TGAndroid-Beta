package org.webrtc;
public final class p implements Runnable {
    public final int f45022a;
    public final ScreenCapturerAndroid f45023b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f45022a = i10;
        this.f45023b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f45022a) {
            case 0:
                ScreenCapturerAndroid.a(this.f45023b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f45023b);
                return;
        }
    }
}
