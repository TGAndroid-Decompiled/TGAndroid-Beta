package org.telegram.ui;
public final class tp implements Runnable {
    public final int f41780a;
    public final dq f41781b;
    public final long f41782c;

    public tp(dq dqVar, long j10, int i10) {
        this.f41780a = i10;
        this.f41781b = dqVar;
        this.f41782c = j10;
    }

    @Override
    public final void run() {
        switch (this.f41780a) {
            case 0:
                long j10 = this.f41782c;
                dq dqVar = this.f41781b;
                dqVar.f36248n = j10;
                dqVar.f36253r = true;
                dqVar.n0();
                return;
            default:
                dq.Z(this.f41781b, this.f41782c);
                return;
        }
    }
}
