package org.telegram.ui;
public final class ud implements Runnable {
    public final int f41798a;
    public final ke f41799b;
    public final na1 f41800c;
    public final TwoStepVerificationActivity d;

    public ud(ke keVar, na1 na1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41798a = i10;
        this.f41799b = keVar;
        this.f41800c = na1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41798a) {
            case 0:
                this.f41799b.H0.setLoading(false);
                this.f41800c.presentFragment(this.d);
                return;
            case 1:
                this.f41799b.N0.setLoading(false);
                this.f41800c.presentFragment(this.d);
                return;
            default:
                this.f41799b.N0.setLoading(false);
                this.f41800c.presentFragment(this.d);
                return;
        }
    }
}
