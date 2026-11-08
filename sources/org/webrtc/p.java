package org.webrtc;
public final class p implements Runnable {
    public final int f53059a;
    public final ScreenCapturerAndroid f53060b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i7) {
        this.f53059a = i7;
        this.f53060b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f53059a) {
            case 0:
                ScreenCapturerAndroid.a(this.f53060b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f53060b);
                return;
        }
    }
}
