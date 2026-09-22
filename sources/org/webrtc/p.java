package org.webrtc;
public final class p implements Runnable {
    public final int f40365a;
    public final ScreenCapturerAndroid f40366b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40365a = i10;
        this.f40366b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40365a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40366b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40366b);
                return;
        }
    }
}
