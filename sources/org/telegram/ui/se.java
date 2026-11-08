package org.telegram.ui;
public final class se implements Runnable {
    public final int f49743a;
    public final an f49744b;
    public final long f49745c;
    public final long d;

    public se(an anVar, long j3, long j10, int i7) {
        this.f49743a = i7;
        this.f49744b = anVar;
        this.f49745c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f49743a) {
            case 0:
                an.o0(this.f49744b, this.f49745c, this.d);
                return;
            default:
                an.F1(this.f49744b, this.f49745c, this.d);
                return;
        }
    }
}
