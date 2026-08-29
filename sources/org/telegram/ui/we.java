package org.telegram.ui;
public final class we implements Runnable {
    public final int f43954a;
    public final tn f43955b;
    public final long f43956c;
    public final long d;

    public we(tn tnVar, long j10, long j11, int i10) {
        this.f43954a = i10;
        this.f43955b = tnVar;
        this.f43956c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f43954a) {
            case 0:
                tn.o0(this.f43955b, this.f43956c, this.d);
                return;
            default:
                tn.k1(this.f43955b, this.f43956c, this.d);
                return;
        }
    }
}
