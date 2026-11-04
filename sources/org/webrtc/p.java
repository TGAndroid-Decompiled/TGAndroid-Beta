package org.webrtc;
public final class p implements Runnable {
    public final int f53033a;
    public final ScreenCapturerAndroid f53034b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i3) {
        this.f53033a = i3;
        this.f53034b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f53033a) {
            case 0:
                ScreenCapturerAndroid.a(this.f53034b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f53034b);
                return;
        }
    }
}
