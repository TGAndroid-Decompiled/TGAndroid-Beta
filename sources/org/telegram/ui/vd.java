package org.telegram.ui;
public final class vd implements Runnable {
    public final int f44771a;
    public final ke f44772b;
    public final w91 f44773c;
    public final TwoStepVerificationActivity d;

    public vd(ke keVar, w91 w91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f44771a = i10;
        this.f44772b = keVar;
        this.f44773c = w91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f44771a) {
            case 0:
                this.f44772b.A0.setLoading(false);
                this.f44773c.presentFragment(this.d);
                return;
            case 1:
                this.f44772b.G0.setLoading(false);
                this.f44773c.presentFragment(this.d);
                return;
            default:
                this.f44772b.G0.setLoading(false);
                this.f44773c.presentFragment(this.d);
                return;
        }
    }
}
