package org.telegram.ui;

public final class ye implements Runnable {

    public final int f44792a;

    public final rn f44793b;

    public final long f44794c;
    public final long d;

    public ye(rn rnVar, long j10, long j11, int i10) {
        this.f44792a = i10;
        this.f44793b = rnVar;
        this.f44794c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f44792a) {
            case 0:
                rn.o0(this.f44793b, this.f44794c, this.d);
                break;
            default:
                rn.k1(this.f44793b, this.f44794c, this.d);
                break;
        }
    }
}
