package org.telegram.ui;
public final class te implements Runnable {
    public final int f52264a;
    public final bn f52265b;
    public final long f52266c;
    public final long d;

    public te(bn bnVar, long j3, long j10, int i7) {
        this.f52264a = i7;
        this.f52265b = bnVar;
        this.f52266c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f52264a) {
            case 0:
                bn.p0(this.f52265b, this.f52266c, this.d);
                return;
            default:
                bn.G1(this.f52265b, this.f52266c, this.d);
                return;
        }
    }
}
