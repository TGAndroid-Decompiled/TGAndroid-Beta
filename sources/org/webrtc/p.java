package org.webrtc;
public final class p implements Runnable {
    public final int f40738a;
    public final ScreenCapturerAndroid f40739b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40738a = i10;
        this.f40739b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40738a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40739b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40739b);
                return;
        }
    }
}
