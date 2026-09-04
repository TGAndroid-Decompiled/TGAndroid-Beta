package org.telegram.ui;
public final class td implements Runnable {
    public final int f40715a;
    public final ke f40716b;
    public final bb1 f40717c;
    public final TwoStepVerificationActivity d;

    public td(ke keVar, bb1 bb1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40715a = i10;
        this.f40716b = keVar;
        this.f40717c = bb1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f40715a) {
            case 0:
                this.f40716b.K0.setLoading(false);
                this.f40717c.presentFragment(this.d);
                return;
            case 1:
                this.f40716b.Q0.setLoading(false);
                this.f40717c.presentFragment(this.d);
                return;
            default:
                this.f40716b.Q0.setLoading(false);
                this.f40717c.presentFragment(this.d);
                return;
        }
    }
}
