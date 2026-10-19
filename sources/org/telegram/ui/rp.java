package org.telegram.ui;
public final class rp implements Runnable {
    public final int f41258a;
    public final bq f41259b;
    public final long f41260c;

    public rp(bq bqVar, long j10, int i10) {
        this.f41258a = i10;
        this.f41259b = bqVar;
        this.f41260c = j10;
    }

    @Override
    public final void run() {
        switch (this.f41258a) {
            case 0:
                long j10 = this.f41260c;
                bq bqVar = this.f41259b;
                bqVar.f35696n = j10;
                bqVar.f35701r = true;
                bqVar.n0();
                return;
            default:
                bq.Z(this.f41259b, this.f41260c);
                return;
        }
    }
}
