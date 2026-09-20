package org.telegram.ui;
public final class td implements Runnable {
    public final int f37728a;
    public final ke f37729b;
    public final bb1 f37730c;
    public final TwoStepVerificationActivity d;

    public td(ke keVar, bb1 bb1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37728a = i10;
        this.f37729b = keVar;
        this.f37730c = bb1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f37728a) {
            case 0:
                this.f37729b.K0.setLoading(false);
                this.f37730c.presentFragment(this.d);
                return;
            case 1:
                this.f37729b.Q0.setLoading(false);
                this.f37730c.presentFragment(this.d);
                return;
            default:
                this.f37729b.Q0.setLoading(false);
                this.f37730c.presentFragment(this.d);
                return;
        }
    }
}
