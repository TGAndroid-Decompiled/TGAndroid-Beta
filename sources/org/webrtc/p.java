package org.webrtc;
public final class p implements Runnable {
    public final int f40637a;
    public final ScreenCapturerAndroid f40638b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40637a = i10;
        this.f40638b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40637a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40638b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40638b);
                return;
        }
    }
}
