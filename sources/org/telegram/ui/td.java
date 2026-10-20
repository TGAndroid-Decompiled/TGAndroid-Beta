package org.telegram.ui;
public final class td implements Runnable {
    public final int f41647a;
    public final ie f41648b;
    public final p91 f41649c;
    public final TwoStepVerificationActivity d;

    public td(ie ieVar, p91 p91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41647a = i10;
        this.f41648b = ieVar;
        this.f41649c = p91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41647a) {
            case 0:
                this.f41648b.K0.setLoading(false);
                this.f41649c.presentFragment(this.d);
                return;
            case 1:
                this.f41648b.Q0.setLoading(false);
                this.f41649c.presentFragment(this.d);
                return;
            default:
                this.f41648b.Q0.setLoading(false);
                this.f41649c.presentFragment(this.d);
                return;
        }
    }
}
