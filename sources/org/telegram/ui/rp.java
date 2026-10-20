package org.telegram.ui;
public final class rp implements Runnable {
    public final int f41264a;
    public final bq f41265b;
    public final long f41266c;

    public rp(bq bqVar, long j10, int i10) {
        this.f41264a = i10;
        this.f41265b = bqVar;
        this.f41266c = j10;
    }

    @Override
    public final void run() {
        switch (this.f41264a) {
            case 0:
                long j10 = this.f41266c;
                bq bqVar = this.f41265b;
                bqVar.f35702n = j10;
                bqVar.f35707r = true;
                bqVar.n0();
                return;
            default:
                bq.Z(this.f41265b, this.f41266c);
                return;
        }
    }
}
