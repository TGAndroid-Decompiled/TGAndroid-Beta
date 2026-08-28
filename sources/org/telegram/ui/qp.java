package org.telegram.ui;
public final class qp implements Runnable {
    public final int f42171a;
    public final bq f42172b;
    public final long f42173c;

    public qp(bq bqVar, long j10, int i9) {
        this.f42171a = i9;
        this.f42172b = bqVar;
        this.f42173c = j10;
    }

    @Override
    public final void run() {
        switch (this.f42171a) {
            case 0:
                long j10 = this.f42173c;
                bq bqVar = this.f42172b;
                bqVar.f36936n = j10;
                bqVar.f36941r = true;
                bqVar.m0();
                return;
            default:
                bq.Y(this.f42172b, this.f42173c);
                return;
        }
    }
}
