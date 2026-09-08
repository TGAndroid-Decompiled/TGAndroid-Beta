package org.webrtc;
public final class p implements Runnable {
    public final int f43639a;
    public final ScreenCapturerAndroid f43640b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43639a = i10;
        this.f43640b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43639a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43640b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43640b);
                return;
        }
    }
}
