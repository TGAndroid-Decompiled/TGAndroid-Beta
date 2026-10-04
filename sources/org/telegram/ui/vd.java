package org.telegram.ui;
public final class vd implements Runnable {
    public final int f41701a;
    public final me f41702b;
    public final va1 f41703c;
    public final TwoStepVerificationActivity d;

    public vd(me meVar, va1 va1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41701a = i10;
        this.f41702b = meVar;
        this.f41703c = va1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41701a) {
            case 0:
                this.f41702b.D1.setLoading(false);
                this.f41703c.presentFragment(this.d);
                return;
            case 1:
                this.f41702b.J1.setLoading(false);
                this.f41703c.presentFragment(this.d);
                return;
            default:
                this.f41702b.J1.setLoading(false);
                this.f41703c.presentFragment(this.d);
                return;
        }
    }
}
