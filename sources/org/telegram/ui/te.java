package org.telegram.ui;
public final class te implements Runnable {
    public final int f52270a;
    public final bn f52271b;
    public final long f52272c;
    public final long d;

    public te(bn bnVar, long j3, long j10, int i7) {
        this.f52270a = i7;
        this.f52271b = bnVar;
        this.f52272c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f52270a) {
            case 0:
                bn.p0(this.f52271b, this.f52272c, this.d);
                return;
            default:
                bn.G1(this.f52271b, this.f52272c, this.d);
                return;
        }
    }
}
