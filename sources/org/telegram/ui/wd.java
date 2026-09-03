package org.telegram.ui;
public final class wd implements Runnable {
    public final int f39345a;
    public final me f39346b;
    public final oa1 f39347c;
    public final TwoStepVerificationActivity d;

    public wd(me meVar, oa1 oa1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f39345a = i10;
        this.f39346b = meVar;
        this.f39347c = oa1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f39345a) {
            case 0:
                this.f39346b.H0.setLoading(false);
                this.f39347c.presentFragment(this.d);
                return;
            case 1:
                this.f39346b.N0.setLoading(false);
                this.f39347c.presentFragment(this.d);
                return;
            default:
                this.f39346b.N0.setLoading(false);
                this.f39347c.presentFragment(this.d);
                return;
        }
    }
}
