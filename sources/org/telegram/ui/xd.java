package org.telegram.ui;
public final class xd implements Runnable {
    public final int f43899a;
    public final oe f43900b;
    public final db1 f43901c;
    public final TwoStepVerificationActivity d;

    public xd(oe oeVar, db1 db1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f43899a = i10;
        this.f43900b = oeVar;
        this.f43901c = db1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f43899a) {
            case 0:
                this.f43900b.K0.setLoading(false);
                this.f43901c.presentFragment(this.d);
                return;
            case 1:
                this.f43900b.Q0.setLoading(false);
                this.f43901c.presentFragment(this.d);
                return;
            default:
                this.f43900b.Q0.setLoading(false);
                this.f43901c.presentFragment(this.d);
                return;
        }
    }
}
