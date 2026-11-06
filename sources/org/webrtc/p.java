package org.webrtc;
public final class p implements Runnable {
    public final int f52942a;
    public final ScreenCapturerAndroid f52943b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i7) {
        this.f52942a = i7;
        this.f52943b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f52942a) {
            case 0:
                ScreenCapturerAndroid.a(this.f52943b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f52943b);
                return;
        }
    }
}
