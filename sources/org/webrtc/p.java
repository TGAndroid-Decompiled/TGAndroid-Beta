package org.webrtc;
public final class p implements Runnable {
    public final int f40687a;
    public final ScreenCapturerAndroid f40688b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40687a = i10;
        this.f40688b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40687a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40688b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40688b);
                return;
        }
    }
}
