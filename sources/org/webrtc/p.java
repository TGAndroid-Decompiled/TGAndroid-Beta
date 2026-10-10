package org.webrtc;
public final class p implements Runnable {
    public final int f45178a;
    public final ScreenCapturerAndroid f45179b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f45178a = i10;
        this.f45179b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f45178a) {
            case 0:
                ScreenCapturerAndroid.a(this.f45179b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f45179b);
                return;
        }
    }
}
