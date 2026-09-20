package org.webrtc;
public final class p implements Runnable {
    public final int f40666a;
    public final ScreenCapturerAndroid f40667b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40666a = i10;
        this.f40667b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40666a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40667b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40667b);
                return;
        }
    }
}
