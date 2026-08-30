package org.webrtc;
public final class p implements Runnable {
    public final int f40914a;
    public final ScreenCapturerAndroid f40915b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40914a = i10;
        this.f40915b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40914a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40915b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40915b);
                return;
        }
    }
}
