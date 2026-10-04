package org.telegram.ui;
public final class vd implements Runnable {
    public final int f41700a;
    public final me f41701b;
    public final va1 f41702c;
    public final TwoStepVerificationActivity d;

    public vd(me meVar, va1 va1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41700a = i10;
        this.f41701b = meVar;
        this.f41702c = va1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41700a) {
            case 0:
                this.f41701b.D1.setLoading(false);
                this.f41702c.presentFragment(this.d);
                return;
            case 1:
                this.f41701b.J1.setLoading(false);
                this.f41702c.presentFragment(this.d);
                return;
            default:
                this.f41701b.J1.setLoading(false);
                this.f41702c.presentFragment(this.d);
                return;
        }
    }
}
