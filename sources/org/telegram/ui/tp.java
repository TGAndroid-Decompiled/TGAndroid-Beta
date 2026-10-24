package org.telegram.ui;
public final class tp implements Runnable {
    public final int f42100a;
    public final dq f42101b;
    public final long f42102c;

    public tp(dq dqVar, long j10, int i10) {
        this.f42100a = i10;
        this.f42101b = dqVar;
        this.f42102c = j10;
    }

    @Override
    public final void run() {
        switch (this.f42100a) {
            case 0:
                long j10 = this.f42102c;
                dq dqVar = this.f42101b;
                dqVar.f36688r = j10;
                dqVar.f36690s = true;
                dqVar.n0();
                return;
            default:
                dq.Z(this.f42101b, this.f42102c);
                return;
        }
    }
}
