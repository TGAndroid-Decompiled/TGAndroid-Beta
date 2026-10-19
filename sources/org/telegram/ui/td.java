package org.telegram.ui;
public final class td implements Runnable {
    public final int f41641a;
    public final ie f41642b;
    public final p91 f41643c;
    public final TwoStepVerificationActivity d;

    public td(ie ieVar, p91 p91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41641a = i10;
        this.f41642b = ieVar;
        this.f41643c = p91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41641a) {
            case 0:
                this.f41642b.K0.setLoading(false);
                this.f41643c.presentFragment(this.d);
                return;
            case 1:
                this.f41642b.Q0.setLoading(false);
                this.f41643c.presentFragment(this.d);
                return;
            default:
                this.f41642b.Q0.setLoading(false);
                this.f41643c.presentFragment(this.d);
                return;
        }
    }
}
