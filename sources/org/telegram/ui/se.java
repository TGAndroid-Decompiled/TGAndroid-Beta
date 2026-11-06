package org.telegram.ui;
public final class se implements Runnable {
    public final int f49752a;
    public final an f49753b;
    public final long f49754c;
    public final long d;

    public se(an anVar, long j3, long j10, int i7) {
        this.f49752a = i7;
        this.f49753b = anVar;
        this.f49754c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f49752a) {
            case 0:
                an.o0(this.f49753b, this.f49754c, this.d);
                return;
            default:
                an.F1(this.f49753b, this.f49754c, this.d);
                return;
        }
    }
}
