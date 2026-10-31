package org.webrtc;
public final class p implements Runnable {
    public final int f44507a;
    public final ScreenCapturerAndroid f44508b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f44507a = i10;
        this.f44508b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f44507a) {
            case 0:
                ScreenCapturerAndroid.a(this.f44508b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f44508b);
                return;
        }
    }
}
