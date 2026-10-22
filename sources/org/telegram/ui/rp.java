package org.telegram.ui;
public final class rp implements Runnable {
    public final int f41267a;
    public final bq f41268b;
    public final long f41269c;

    public rp(bq bqVar, long j10, int i10) {
        this.f41267a = i10;
        this.f41268b = bqVar;
        this.f41269c = j10;
    }

    @Override
    public final void run() {
        switch (this.f41267a) {
            case 0:
                long j10 = this.f41269c;
                bq bqVar = this.f41268b;
                bqVar.f35706n = j10;
                bqVar.f35711r = true;
                bqVar.n0();
                return;
            default:
                bq.Z(this.f41268b, this.f41269c);
                return;
        }
    }
}
