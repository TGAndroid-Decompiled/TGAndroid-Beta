package org.telegram.ui;
public final class tp implements Runnable {
    public final int f42056a;
    public final dq f42057b;
    public final long f42058c;

    public tp(dq dqVar, long j10, int i10) {
        this.f42056a = i10;
        this.f42057b = dqVar;
        this.f42058c = j10;
    }

    @Override
    public final void run() {
        switch (this.f42056a) {
            case 0:
                long j10 = this.f42058c;
                dq dqVar = this.f42057b;
                dqVar.f36697r = j10;
                dqVar.f36699s = true;
                dqVar.n0();
                return;
            default:
                dq.Z(this.f42057b, this.f42058c);
                return;
        }
    }
}
