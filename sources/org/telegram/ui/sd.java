package org.telegram.ui;
public final class sd implements Runnable {
    public final int f41740a;
    public final je f41741b;
    public final ab1 f41742c;
    public final TwoStepVerificationActivity d;

    public sd(je jeVar, ab1 ab1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41740a = i10;
        this.f41741b = jeVar;
        this.f41742c = ab1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41740a) {
            case 0:
                this.f41741b.K0.setLoading(false);
                this.f41742c.presentFragment(this.d);
                return;
            case 1:
                this.f41741b.Q0.setLoading(false);
                this.f41742c.presentFragment(this.d);
                return;
            default:
                this.f41741b.Q0.setLoading(false);
                this.f41742c.presentFragment(this.d);
                return;
        }
    }
}
