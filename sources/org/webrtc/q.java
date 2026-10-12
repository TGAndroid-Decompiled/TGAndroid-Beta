package org.webrtc;
public final class q implements Runnable {
    public final int f42807a;
    public final ScreenCapturerAndroid f42808b;

    public q(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.f42807a = i10;
        this.f42808b = screenCapturerAndroid;
    }

    @Override
    public final void run() {
        switch (this.f42807a) {
            case 0:
                ScreenCapturerAndroid.a(this.f42808b);
                return;
            default:
                ScreenCapturerAndroid.b(this.f42808b);
                return;
        }
    }
}
