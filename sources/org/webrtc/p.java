package org.webrtc;
public final class p implements Runnable {
    public final int f40639a;
    public final ScreenCapturerAndroid f40640b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40639a = i10;
        this.f40640b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40639a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40640b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40640b);
                return;
        }
    }
}
