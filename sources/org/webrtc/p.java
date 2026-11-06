package org.webrtc;
public final class p implements Runnable {
    public final int f52966a;
    public final ScreenCapturerAndroid f52967b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i7) {
        this.f52966a = i7;
        this.f52967b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f52966a) {
            case 0:
                ScreenCapturerAndroid.a(this.f52967b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f52967b);
                return;
        }
    }
}
