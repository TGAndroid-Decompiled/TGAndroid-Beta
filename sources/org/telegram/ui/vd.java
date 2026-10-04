package org.telegram.ui;
public final class vd implements Runnable {
    public final int f41708a;
    public final me f41709b;
    public final va1 f41710c;
    public final TwoStepVerificationActivity d;

    public vd(me meVar, va1 va1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41708a = i10;
        this.f41709b = meVar;
        this.f41710c = va1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41708a) {
            case 0:
                this.f41709b.D1.setLoading(false);
                this.f41710c.presentFragment(this.d);
                return;
            case 1:
                this.f41709b.J1.setLoading(false);
                this.f41710c.presentFragment(this.d);
                return;
            default:
                this.f41709b.J1.setLoading(false);
                this.f41710c.presentFragment(this.d);
                return;
        }
    }
}
