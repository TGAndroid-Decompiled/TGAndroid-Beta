package org.webrtc;
public final class p implements Runnable {
    public final int f40625a;
    public final ScreenCapturerAndroid f40626b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40625a = i10;
        this.f40626b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40625a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40626b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40626b);
                return;
        }
    }
}
