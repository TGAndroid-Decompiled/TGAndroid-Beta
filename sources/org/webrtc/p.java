package org.webrtc;
public final class p implements Runnable {
    public final int f40640a;
    public final ScreenCapturerAndroid f40641b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40640a = i10;
        this.f40641b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40640a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40641b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40641b);
                return;
        }
    }
}
