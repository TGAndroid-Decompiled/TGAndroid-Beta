package org.webrtc;
public final class p implements Runnable {
    public final int f40936a;
    public final ScreenCapturerAndroid f40937b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40936a = i10;
        this.f40937b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40936a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40937b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40937b);
                return;
        }
    }
}
