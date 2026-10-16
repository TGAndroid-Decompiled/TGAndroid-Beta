package org.telegram.ui;
public final class zd implements Runnable {
    public final int f42278a;
    public final qe f42279b;
    public final hb1 f42280c;
    public final TwoStepVerificationActivity d;

    public zd(qe qeVar, hb1 hb1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f42278a = i10;
        this.f42279b = qeVar;
        this.f42280c = hb1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f42278a) {
            case 0:
                this.f42279b.K0.setLoading(false);
                this.f42280c.presentFragment(this.d);
                return;
            case 1:
                this.f42279b.Q0.setLoading(false);
                this.f42280c.presentFragment(this.d);
                return;
            default:
                this.f42279b.Q0.setLoading(false);
                this.f42280c.presentFragment(this.d);
                return;
        }
    }
}
