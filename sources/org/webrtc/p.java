package org.webrtc;
public final class p implements Runnable {
    public final int f43899a;
    public final ScreenCapturerAndroid f43900b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43899a = i10;
        this.f43900b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43899a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43900b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43900b);
                return;
        }
    }
}
