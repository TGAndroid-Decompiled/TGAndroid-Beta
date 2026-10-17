package org.telegram.ui;
public final class tp implements Runnable {
    public final int f41795a;
    public final dq f41796b;
    public final long f41797c;

    public tp(dq dqVar, long j10, int i10) {
        this.f41795a = i10;
        this.f41796b = dqVar;
        this.f41797c = j10;
    }

    @Override
    public final void run() {
        switch (this.f41795a) {
            case 0:
                long j10 = this.f41797c;
                dq dqVar = this.f41796b;
                dqVar.f36286n = j10;
                dqVar.f36291r = true;
                dqVar.n0();
                return;
            default:
                dq.Z(this.f41796b, this.f41797c);
                return;
        }
    }
}
