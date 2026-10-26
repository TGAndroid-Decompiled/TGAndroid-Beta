package org.webrtc;
public final class p implements Runnable {
    public final int f46460a;
    public final ScreenCapturerAndroid f46461b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f46460a = i10;
        this.f46461b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f46460a) {
            case 0:
                ScreenCapturerAndroid.a(this.f46461b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f46461b);
                return;
        }
    }
}
