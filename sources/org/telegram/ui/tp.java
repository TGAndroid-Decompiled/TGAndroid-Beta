package org.telegram.ui;
public final class tp implements Runnable {
    public final int f41821a;
    public final dq f41822b;
    public final long f41823c;

    public tp(dq dqVar, long j10, int i10) {
        this.f41821a = i10;
        this.f41822b = dqVar;
        this.f41823c = j10;
    }

    @Override
    public final void run() {
        switch (this.f41821a) {
            case 0:
                long j10 = this.f41823c;
                dq dqVar = this.f41822b;
                dqVar.f36285n = j10;
                dqVar.f36290r = true;
                dqVar.n0();
                return;
            default:
                dq.Z(this.f41822b, this.f41823c);
                return;
        }
    }
}
