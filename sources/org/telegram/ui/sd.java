package org.telegram.ui;
public final class sd implements Runnable {
    public final int f41706a;
    public final je f41707b;
    public final ab1 f41708c;
    public final TwoStepVerificationActivity d;

    public sd(je jeVar, ab1 ab1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41706a = i10;
        this.f41707b = jeVar;
        this.f41708c = ab1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41706a) {
            case 0:
                this.f41707b.K0.setLoading(false);
                this.f41708c.presentFragment(this.d);
                return;
            case 1:
                this.f41707b.Q0.setLoading(false);
                this.f41708c.presentFragment(this.d);
                return;
            default:
                this.f41707b.Q0.setLoading(false);
                this.f41708c.presentFragment(this.d);
                return;
        }
    }
}
