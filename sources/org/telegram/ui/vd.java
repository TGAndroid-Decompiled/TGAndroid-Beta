package org.telegram.ui;
public final class vd implements Runnable {
    public final int f44768a;
    public final ke f44769b;
    public final w91 f44770c;
    public final TwoStepVerificationActivity d;

    public vd(ke keVar, w91 w91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f44768a = i10;
        this.f44769b = keVar;
        this.f44770c = w91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f44768a) {
            case 0:
                this.f44769b.A0.setLoading(false);
                this.f44770c.presentFragment(this.d);
                return;
            case 1:
                this.f44769b.G0.setLoading(false);
                this.f44770c.presentFragment(this.d);
                return;
            default:
                this.f44769b.G0.setLoading(false);
                this.f44770c.presentFragment(this.d);
                return;
        }
    }
}
