package org.webrtc;
public final class p implements Runnable {
    public final int f52968a;
    public final ScreenCapturerAndroid f52969b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i7) {
        this.f52968a = i7;
        this.f52969b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f52968a) {
            case 0:
                ScreenCapturerAndroid.a(this.f52969b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f52969b);
                return;
        }
    }
}
