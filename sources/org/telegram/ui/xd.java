package org.telegram.ui;
public final class xd implements Runnable {
    public final int f43894a;
    public final oe f43895b;
    public final db1 f43896c;
    public final TwoStepVerificationActivity d;

    public xd(oe oeVar, db1 db1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f43894a = i10;
        this.f43895b = oeVar;
        this.f43896c = db1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f43894a) {
            case 0:
                this.f43895b.K0.setLoading(false);
                this.f43896c.presentFragment(this.d);
                return;
            case 1:
                this.f43895b.Q0.setLoading(false);
                this.f43896c.presentFragment(this.d);
                return;
            default:
                this.f43895b.Q0.setLoading(false);
                this.f43896c.presentFragment(this.d);
                return;
        }
    }
}
