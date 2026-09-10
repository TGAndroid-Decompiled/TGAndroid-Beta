package org.telegram.ui;
public final class ud implements Runnable {
    public final int f37239a;
    public final le f37240b;
    public final fb1 f37241c;
    public final TwoStepVerificationActivity d;

    public ud(le leVar, fb1 fb1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37239a = i10;
        this.f37240b = leVar;
        this.f37241c = fb1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f37239a) {
            case 0:
                this.f37240b.K0.setLoading(false);
                this.f37241c.presentFragment(this.d);
                return;
            case 1:
                this.f37240b.Q0.setLoading(false);
                this.f37241c.presentFragment(this.d);
                return;
            default:
                this.f37240b.Q0.setLoading(false);
                this.f37241c.presentFragment(this.d);
                return;
        }
    }
}
