package org.webrtc;
public final class p implements Runnable {
    public final int f39497a;
    public final ScreenCapturerAndroid f39498b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f39497a = i10;
        this.f39498b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f39497a) {
            case 0:
                ScreenCapturerAndroid.a(this.f39498b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f39498b);
                return;
        }
    }
}
