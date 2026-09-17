package org.telegram.ui;
public final class ud implements Runnable {
    public final int f38040a;
    public final le f38041b;
    public final ab1 f38042c;
    public final TwoStepVerificationActivity d;

    public ud(le leVar, ab1 ab1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f38040a = i10;
        this.f38041b = leVar;
        this.f38042c = ab1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f38040a) {
            case 0:
                this.f38041b.K0.setLoading(false);
                this.f38042c.presentFragment(this.d);
                return;
            case 1:
                this.f38041b.Q0.setLoading(false);
                this.f38042c.presentFragment(this.d);
                return;
            default:
                this.f38041b.Q0.setLoading(false);
                this.f38042c.presentFragment(this.d);
                return;
        }
    }
}
