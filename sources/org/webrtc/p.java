package org.webrtc;
public final class p implements Runnable {
    public final int f40369a;
    public final ScreenCapturerAndroid f40370b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40369a = i10;
        this.f40370b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40369a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40370b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40370b);
                return;
        }
    }
}
