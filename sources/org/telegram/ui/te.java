package org.telegram.ui;
public final class te implements Runnable {
    public final int f50252a;
    public final cn f50253b;
    public final long f50254c;
    public final long d;

    public te(cn cnVar, long j3, long j10, int i7) {
        this.f50252a = i7;
        this.f50253b = cnVar;
        this.f50254c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f50252a) {
            case 0:
                cn.p0(this.f50253b, this.f50254c, this.d);
                return;
            default:
                cn.G1(this.f50253b, this.f50254c, this.d);
                return;
        }
    }
}
