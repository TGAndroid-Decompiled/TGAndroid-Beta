package org.webrtc;
public final class p implements Runnable {
    public final int f40638a;
    public final ScreenCapturerAndroid f40639b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40638a = i10;
        this.f40639b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40638a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40639b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40639b);
                return;
        }
    }
}
