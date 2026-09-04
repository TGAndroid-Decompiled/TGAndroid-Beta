package org.webrtc;
public final class p implements Runnable {
    public final int f43612a;
    public final ScreenCapturerAndroid f43613b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43612a = i10;
        this.f43613b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43612a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43613b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43613b);
                return;
        }
    }
}
