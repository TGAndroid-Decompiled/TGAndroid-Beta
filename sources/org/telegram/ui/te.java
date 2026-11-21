package org.telegram.ui;
public final class te implements Runnable {
    public final int f52314a;
    public final bn f52315b;
    public final long f52316c;
    public final long d;

    public te(bn bnVar, long j3, long j10, int i7) {
        this.f52314a = i7;
        this.f52315b = bnVar;
        this.f52316c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f52314a) {
            case 0:
                bn.p0(this.f52315b, this.f52316c, this.d);
                return;
            default:
                bn.G1(this.f52315b, this.f52316c, this.d);
                return;
        }
    }
}
