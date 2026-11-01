package org.telegram.ui;
public final class sd implements Runnable {
    public final int f41345a;
    public final le f41346b;
    public final s61 f41347c;
    public final TwoStepVerificationActivity d;

    public sd(le leVar, s61 s61Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41345a = i10;
        this.f41346b = leVar;
        this.f41347c = s61Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41345a) {
            case 0:
                this.f41346b.A0.setLoading(false);
                this.f41347c.presentFragment(this.d);
                return;
            case 1:
                this.f41346b.G0.setLoading(false);
                this.f41347c.presentFragment(this.d);
                return;
            default:
                this.f41346b.G0.setLoading(false);
                this.f41347c.presentFragment(this.d);
                return;
        }
    }
}
