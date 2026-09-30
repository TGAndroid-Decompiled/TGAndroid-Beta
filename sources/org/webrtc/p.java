package org.webrtc;
public final class p implements Runnable {
    public final int f40641a;
    public final ScreenCapturerAndroid f40642b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40641a = i10;
        this.f40642b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40641a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40642b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40642b);
                return;
        }
    }
}
