package org.webrtc;
public final class p implements Runnable {
    public final int f43968a;
    public final ScreenCapturerAndroid f43969b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43968a = i10;
        this.f43969b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43968a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43969b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43969b);
                return;
        }
    }
}
