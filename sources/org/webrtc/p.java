package org.webrtc;
public final class p implements Runnable {
    public final int f40320a;
    public final ScreenCapturerAndroid f40321b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40320a = i10;
        this.f40321b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40320a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40321b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40321b);
                return;
        }
    }
}
