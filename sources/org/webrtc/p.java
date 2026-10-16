package org.webrtc;
public final class p implements Runnable {
    public final int f42507a;
    public final ScreenCapturerAndroid f42508b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f42507a = i10;
        this.f42508b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f42507a) {
            case 0:
                ScreenCapturerAndroid.a(this.f42508b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f42508b);
                return;
        }
    }
}
