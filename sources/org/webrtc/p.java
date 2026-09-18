package org.webrtc;
public final class p implements Runnable {
    public final int f40396a;
    public final ScreenCapturerAndroid f40397b;

    public p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f40396a = i10;
        this.f40397b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f40396a) {
            case 0:
                ScreenCapturerAndroid.a(this.f40397b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f40397b);
                return;
        }
    }
}
