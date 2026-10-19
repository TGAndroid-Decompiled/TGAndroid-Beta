package org.webrtc;
public final class p implements Runnable {
    public final int f43888a;
    public final ScreenCapturerAndroid f43889b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43888a = i10;
        this.f43889b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43888a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43889b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43889b);
                return;
        }
    }
}
