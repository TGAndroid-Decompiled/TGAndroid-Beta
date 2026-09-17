package org.telegram.ui;
public final class td implements Runnable {
    public final int f40743a;
    public final ke f40744b;
    public final bb1 f40745c;
    public final TwoStepVerificationActivity d;

    public td(ke keVar, bb1 bb1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40743a = i10;
        this.f40744b = keVar;
        this.f40745c = bb1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f40743a) {
            case 0:
                this.f40744b.K0.setLoading(false);
                this.f40745c.presentFragment(this.d);
                return;
            case 1:
                this.f40744b.Q0.setLoading(false);
                this.f40745c.presentFragment(this.d);
                return;
            default:
                this.f40744b.Q0.setLoading(false);
                this.f40745c.presentFragment(this.d);
                return;
        }
    }
}
