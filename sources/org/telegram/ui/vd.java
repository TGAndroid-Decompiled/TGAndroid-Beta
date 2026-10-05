package org.telegram.ui;
public final class vd implements Runnable {
    public final int f41713a;
    public final me f41714b;
    public final ta1 f41715c;
    public final TwoStepVerificationActivity d;

    public vd(me meVar, ta1 ta1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41713a = i10;
        this.f41714b = meVar;
        this.f41715c = ta1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41713a) {
            case 0:
                this.f41714b.A0.setLoading(false);
                this.f41715c.presentFragment(this.d);
                return;
            case 1:
                this.f41714b.G0.setLoading(false);
                this.f41715c.presentFragment(this.d);
                return;
            default:
                this.f41714b.G0.setLoading(false);
                this.f41715c.presentFragment(this.d);
                return;
        }
    }
}
