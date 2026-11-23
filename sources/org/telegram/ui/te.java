package org.telegram.ui;
public final class te implements Runnable {
    public final int f52318a;
    public final bn f52319b;
    public final long f52320c;
    public final long d;

    public te(bn bnVar, long j3, long j10, int i7) {
        this.f52318a = i7;
        this.f52319b = bnVar;
        this.f52320c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f52318a) {
            case 0:
                bn.p0(this.f52319b, this.f52320c, this.d);
                return;
            default:
                bn.G1(this.f52319b, this.f52320c, this.d);
                return;
        }
    }
}
