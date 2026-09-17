package org.telegram.ui;
public final class td implements Runnable {
    public final int f40716a;
    public final ke f40717b;
    public final bb1 f40718c;
    public final TwoStepVerificationActivity d;

    public td(ke keVar, bb1 bb1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40716a = i10;
        this.f40717b = keVar;
        this.f40718c = bb1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f40716a) {
            case 0:
                this.f40717b.K0.setLoading(false);
                this.f40718c.presentFragment(this.d);
                return;
            case 1:
                this.f40717b.Q0.setLoading(false);
                this.f40718c.presentFragment(this.d);
                return;
            default:
                this.f40717b.Q0.setLoading(false);
                this.f40718c.presentFragment(this.d);
                return;
        }
    }
}
