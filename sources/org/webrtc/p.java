package org.webrtc;
public final class p implements Runnable {
    public final int f40391a;
    public final ScreenCapturerAndroid f40392b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40391a = i10;
        this.f40392b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40391a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40392b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40392b);
                return;
        }
    }
}
