package org.telegram.ui;
public final class se implements Runnable {
    public final int f49888a;
    public final cn f49889b;
    public final long f49890c;
    public final long d;

    public se(cn cnVar, long j3, long j10, int i7) {
        this.f49888a = i7;
        this.f49889b = cnVar;
        this.f49890c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f49888a) {
            case 0:
                cn.p0(this.f49889b, this.f49890c, this.d);
                return;
            default:
                cn.G1(this.f49889b, this.f49890c, this.d);
                return;
        }
    }
}
