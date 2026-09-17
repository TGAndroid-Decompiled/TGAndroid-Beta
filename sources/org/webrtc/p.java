package org.webrtc;
public final class p implements Runnable {
    public final int f43640a;
    public final ScreenCapturerAndroid f43641b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43640a = i10;
        this.f43641b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43640a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43641b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43641b);
                return;
        }
    }
}
