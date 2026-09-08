package org.telegram.ui;
public final class td implements Runnable {
    public final int f40742a;
    public final ke f40743b;
    public final bb1 f40744c;
    public final TwoStepVerificationActivity d;

    public td(ke keVar, bb1 bb1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40742a = i10;
        this.f40743b = keVar;
        this.f40744c = bb1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f40742a) {
            case 0:
                this.f40743b.K0.setLoading(false);
                this.f40744c.presentFragment(this.d);
                return;
            case 1:
                this.f40743b.Q0.setLoading(false);
                this.f40744c.presentFragment(this.d);
                return;
            default:
                this.f40743b.Q0.setLoading(false);
                this.f40744c.presentFragment(this.d);
                return;
        }
    }
}
