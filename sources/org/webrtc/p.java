package org.webrtc;
public final class p implements Runnable {
    public final int f43914a;
    public final ScreenCapturerAndroid f43915b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f43914a = i10;
        this.f43915b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f43914a) {
            case 0:
                ScreenCapturerAndroid.a(this.f43915b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f43915b);
                return;
        }
    }
}
