package org.webrtc;
public final class p implements Runnable {
    public final int f44315a;
    public final ScreenCapturerAndroid f44316b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f44315a = i10;
        this.f44316b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f44315a) {
            case 0:
                ScreenCapturerAndroid.a(this.f44316b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f44316b);
                return;
        }
    }
}
