package org.telegram.ui;
public final class vd implements Runnable {
    public final int f42155a;
    public final ke f42156b;
    public final r91 f42157c;
    public final TwoStepVerificationActivity d;

    public vd(ke keVar, r91 r91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f42155a = i10;
        this.f42156b = keVar;
        this.f42157c = r91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f42155a) {
            case 0:
                this.f42156b.K0.setLoading(false);
                this.f42157c.presentFragment(this.d);
                return;
            case 1:
                this.f42156b.Q0.setLoading(false);
                this.f42157c.presentFragment(this.d);
                return;
            default:
                this.f42156b.Q0.setLoading(false);
                this.f42157c.presentFragment(this.d);
                return;
        }
    }
}
