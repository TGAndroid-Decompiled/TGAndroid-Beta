package org.telegram.ui;
public final class zd implements Runnable {
    public final int f42593a;
    public final qe f42594b;
    public final hb1 f42595c;
    public final TwoStepVerificationActivity d;

    public zd(qe qeVar, hb1 hb1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f42593a = i10;
        this.f42594b = qeVar;
        this.f42595c = hb1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f42593a) {
            case 0:
                this.f42594b.K0.setLoading(false);
                this.f42595c.presentFragment(this.d);
                return;
            case 1:
                this.f42594b.Q0.setLoading(false);
                this.f42595c.presentFragment(this.d);
                return;
            default:
                this.f42594b.Q0.setLoading(false);
                this.f42595c.presentFragment(this.d);
                return;
        }
    }
}
