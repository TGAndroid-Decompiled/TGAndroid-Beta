package org.webrtc;
public final class p implements Runnable {
    public final int f46495a;
    public final ScreenCapturerAndroid f46496b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f46495a = i10;
        this.f46496b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f46495a) {
            case 0:
                ScreenCapturerAndroid.a(this.f46496b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f46496b);
                return;
        }
    }
}
