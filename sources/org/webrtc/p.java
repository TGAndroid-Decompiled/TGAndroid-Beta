package org.webrtc;
public final class p implements Runnable {
    public final int f53060a;
    public final ScreenCapturerAndroid f53061b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i7) {
        this.f53060a = i7;
        this.f53061b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f53060a) {
            case 0:
                ScreenCapturerAndroid.a(this.f53061b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f53061b);
                return;
        }
    }
}
