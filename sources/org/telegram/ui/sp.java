package org.telegram.ui;

public final class sp implements Runnable {

    public final int f42676a;

    public final dq f42677b;

    public final long f42678c;

    public sp(dq dqVar, long j10, int i10) {
        this.f42676a = i10;
        this.f42677b = dqVar;
        this.f42678c = j10;
    }

    @Override
    public final void run() {
        switch (this.f42676a) {
            case 0:
                long j10 = this.f42678c;
                dq dqVar = this.f42677b;
                dqVar.f37507n = j10;
                dqVar.f37512r = true;
                dqVar.n0();
                break;
            default:
                dq.Z(this.f42677b, this.f42678c);
                break;
        }
    }
}
