package org.telegram.ui;
public final class se implements Runnable {
    public final int f49732a;
    public final an f49733b;
    public final long f49734c;
    public final long d;

    public se(an anVar, long j3, long j10, int i7) {
        this.f49732a = i7;
        this.f49733b = anVar;
        this.f49734c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f49732a) {
            case 0:
                an.o0(this.f49733b, this.f49734c, this.d);
                return;
            default:
                an.F1(this.f49733b, this.f49734c, this.d);
                return;
        }
    }
}
