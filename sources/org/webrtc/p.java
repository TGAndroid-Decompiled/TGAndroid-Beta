package org.webrtc;
public final class p implements Runnable {
    public final int f43953a;
    public final ScreenCapturerAndroid f43954b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43953a = i10;
        this.f43954b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43953a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43954b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43954b);
                return;
        }
    }
}
