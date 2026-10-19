package org.webrtc;
public final class p implements Runnable {
    public final int f43886a;
    public final ScreenCapturerAndroid f43887b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43886a = i10;
        this.f43887b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43886a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43887b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43887b);
                return;
        }
    }
}
