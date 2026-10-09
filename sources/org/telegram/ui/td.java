package org.telegram.ui;
public final class td implements Runnable {
    public final int f41976a;
    public final ke f41977b;
    public final bb1 f41978c;
    public final TwoStepVerificationActivity d;

    public td(ke keVar, bb1 bb1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41976a = i10;
        this.f41977b = keVar;
        this.f41978c = bb1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41976a) {
            case 0:
                this.f41977b.K0.setLoading(false);
                this.f41978c.presentFragment(this.d);
                return;
            case 1:
                this.f41977b.Q0.setLoading(false);
                this.f41978c.presentFragment(this.d);
                return;
            default:
                this.f41977b.Q0.setLoading(false);
                this.f41978c.presentFragment(this.d);
                return;
        }
    }
}
