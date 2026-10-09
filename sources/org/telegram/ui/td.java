package org.telegram.ui;
public final class td implements Runnable {
    public final int f41974a;
    public final ke f41975b;
    public final bb1 f41976c;
    public final TwoStepVerificationActivity d;

    public td(ke keVar, bb1 bb1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41974a = i10;
        this.f41975b = keVar;
        this.f41976c = bb1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41974a) {
            case 0:
                this.f41975b.K0.setLoading(false);
                this.f41976c.presentFragment(this.d);
                return;
            case 1:
                this.f41975b.Q0.setLoading(false);
                this.f41976c.presentFragment(this.d);
                return;
            default:
                this.f41975b.Q0.setLoading(false);
                this.f41976c.presentFragment(this.d);
                return;
        }
    }
}
