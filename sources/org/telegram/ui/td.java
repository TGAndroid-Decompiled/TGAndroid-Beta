package org.telegram.ui;
public final class td implements Runnable {
    public final int f41642a;
    public final ie f41643b;
    public final p91 f41644c;
    public final TwoStepVerificationActivity d;

    public td(ie ieVar, p91 p91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41642a = i10;
        this.f41643b = ieVar;
        this.f41644c = p91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41642a) {
            case 0:
                this.f41643b.K0.setLoading(false);
                this.f41644c.presentFragment(this.d);
                return;
            case 1:
                this.f41643b.Q0.setLoading(false);
                this.f41644c.presentFragment(this.d);
                return;
            default:
                this.f41643b.Q0.setLoading(false);
                this.f41644c.presentFragment(this.d);
                return;
        }
    }
}
