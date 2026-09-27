package org.telegram.ui;
public final class vd implements Runnable {
    public final int f38550a;
    public final me f38551b;
    public final ra1 f38552c;
    public final TwoStepVerificationActivity d;

    public vd(me meVar, ra1 ra1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f38550a = i10;
        this.f38551b = meVar;
        this.f38552c = ra1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f38550a) {
            case 0:
                this.f38551b.K0.setLoading(false);
                this.f38552c.presentFragment(this.d);
                return;
            case 1:
                this.f38551b.Q0.setLoading(false);
                this.f38552c.presentFragment(this.d);
                return;
            default:
                this.f38551b.Q0.setLoading(false);
                this.f38552c.presentFragment(this.d);
                return;
        }
    }
}
