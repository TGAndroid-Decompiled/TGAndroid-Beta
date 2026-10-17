package org.telegram.ui;
public final class vd implements Runnable {
    public final int f42180a;
    public final ke f42181b;
    public final r91 f42182c;
    public final TwoStepVerificationActivity d;

    public vd(ke keVar, r91 r91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f42180a = i10;
        this.f42181b = keVar;
        this.f42182c = r91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f42180a) {
            case 0:
                this.f42181b.K0.setLoading(false);
                this.f42182c.presentFragment(this.d);
                return;
            case 1:
                this.f42181b.Q0.setLoading(false);
                this.f42182c.presentFragment(this.d);
                return;
            default:
                this.f42181b.Q0.setLoading(false);
                this.f42182c.presentFragment(this.d);
                return;
        }
    }
}
