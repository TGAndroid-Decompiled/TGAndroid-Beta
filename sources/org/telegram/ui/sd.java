package org.telegram.ui;
public final class sd implements Runnable {
    public final int f41476a;
    public final le f41477b;
    public final u61 f41478c;
    public final TwoStepVerificationActivity d;

    public sd(le leVar, u61 u61Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41476a = i10;
        this.f41477b = leVar;
        this.f41478c = u61Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41476a) {
            case 0:
                this.f41477b.A0.setLoading(false);
                this.f41478c.presentFragment(this.d);
                return;
            case 1:
                this.f41477b.G0.setLoading(false);
                this.f41478c.presentFragment(this.d);
                return;
            default:
                this.f41477b.G0.setLoading(false);
                this.f41478c.presentFragment(this.d);
                return;
        }
    }
}
