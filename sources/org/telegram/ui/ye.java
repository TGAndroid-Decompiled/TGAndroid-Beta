package org.telegram.ui;
public final class ye implements Runnable {
    public final int f44844a;
    public final qn f44845b;
    public final long f44846c;
    public final long d;

    public ye(qn qnVar, long j10, long j11, int i9) {
        this.f44844a = i9;
        this.f44845b = qnVar;
        this.f44846c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f44844a) {
            case 0:
                qn.n0(this.f44845b, this.f44846c, this.d);
                return;
            default:
                qn.k1(this.f44845b, this.f44846c, this.d);
                return;
        }
    }
}
