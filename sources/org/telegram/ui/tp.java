package org.telegram.ui;
public final class tp implements Runnable {
    public final int f43084a;
    public final dq f43085b;
    public final long f43086c;

    public tp(dq dqVar, long j10, int i10) {
        this.f43084a = i10;
        this.f43085b = dqVar;
        this.f43086c = j10;
    }

    @Override
    public final void run() {
        switch (this.f43084a) {
            case 0:
                long j10 = this.f43086c;
                dq dqVar = this.f43085b;
                dqVar.f37590n = j10;
                dqVar.f37595r = true;
                dqVar.n0();
                return;
            default:
                dq.Z(this.f43085b, this.f43086c);
                return;
        }
    }
}
