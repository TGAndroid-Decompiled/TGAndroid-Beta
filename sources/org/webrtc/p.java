package org.webrtc;
public final class p implements Runnable {
    public final int f44518a;
    public final ScreenCapturerAndroid f44519b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f44518a = i10;
        this.f44519b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f44518a) {
            case 0:
                ScreenCapturerAndroid.a(this.f44519b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f44519b);
                return;
        }
    }
}
