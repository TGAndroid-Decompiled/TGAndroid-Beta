package org.telegram.ui;
public final class ud implements Runnable {
    public final int f41892a;
    public final ke f41893b;
    public final ha1 f41894c;
    public final TwoStepVerificationActivity d;

    public ud(ke keVar, ha1 ha1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41892a = i10;
        this.f41893b = keVar;
        this.f41894c = ha1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41892a) {
            case 0:
                this.f41893b.H0.setLoading(false);
                this.f41894c.presentFragment(this.d);
                return;
            case 1:
                this.f41893b.N0.setLoading(false);
                this.f41894c.presentFragment(this.d);
                return;
            default:
                this.f41893b.N0.setLoading(false);
                this.f41894c.presentFragment(this.d);
                return;
        }
    }
}
