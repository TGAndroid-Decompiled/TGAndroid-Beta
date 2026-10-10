package org.telegram.ui;
public final class td implements Runnable {
    public final int f42020a;
    public final ke f42021b;
    public final bb1 f42022c;
    public final TwoStepVerificationActivity d;

    public td(ke keVar, bb1 bb1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f42020a = i10;
        this.f42021b = keVar;
        this.f42022c = bb1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f42020a) {
            case 0:
                this.f42021b.K0.setLoading(false);
                this.f42022c.presentFragment(this.d);
                return;
            case 1:
                this.f42021b.Q0.setLoading(false);
                this.f42022c.presentFragment(this.d);
                return;
            default:
                this.f42021b.Q0.setLoading(false);
                this.f42022c.presentFragment(this.d);
                return;
        }
    }
}
