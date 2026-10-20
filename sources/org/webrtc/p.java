package org.webrtc;
public final class p implements Runnable {
    public final int f43896a;
    public final ScreenCapturerAndroid f43897b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43896a = i10;
        this.f43897b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43896a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43897b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43897b);
                return;
        }
    }
}
