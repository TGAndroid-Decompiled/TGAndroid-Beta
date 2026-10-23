package org.webrtc;
public final class p implements Runnable {
    public final int f43900a;
    public final ScreenCapturerAndroid f43901b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43900a = i10;
        this.f43901b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43900a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43901b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43901b);
                return;
        }
    }
}
