package org.telegram.ui;
public final class rp implements Runnable {
    public final int f41260a;
    public final bq f41261b;
    public final long f41262c;

    public rp(bq bqVar, long j10, int i10) {
        this.f41260a = i10;
        this.f41261b = bqVar;
        this.f41262c = j10;
    }

    @Override
    public final void run() {
        switch (this.f41260a) {
            case 0:
                long j10 = this.f41262c;
                bq bqVar = this.f41261b;
                bqVar.f35703n = j10;
                bqVar.f35708r = true;
                bqVar.n0();
                return;
            default:
                bq.Z(this.f41261b, this.f41262c);
                return;
        }
    }
}
