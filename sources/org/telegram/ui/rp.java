package org.telegram.ui;
public final class rp implements Runnable {
    public final int f41268a;
    public final bq f41269b;
    public final long f41270c;

    public rp(bq bqVar, long j10, int i10) {
        this.f41268a = i10;
        this.f41269b = bqVar;
        this.f41270c = j10;
    }

    @Override
    public final void run() {
        switch (this.f41268a) {
            case 0:
                long j10 = this.f41270c;
                bq bqVar = this.f41269b;
                bqVar.f35707n = j10;
                bqVar.f35712r = true;
                bqVar.n0();
                return;
            default:
                bq.Z(this.f41269b, this.f41270c);
                return;
        }
    }
}
