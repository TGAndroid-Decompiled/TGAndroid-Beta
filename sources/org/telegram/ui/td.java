package org.telegram.ui;
public final class td implements Runnable {
    public final int f41953a;
    public final ie f41954b;
    public final u91 f41955c;
    public final TwoStepVerificationActivity d;

    public td(ie ieVar, u91 u91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41953a = i10;
        this.f41954b = ieVar;
        this.f41955c = u91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41953a) {
            case 0:
                this.f41954b.K0.setLoading(false);
                this.f41955c.presentFragment(this.d);
                return;
            case 1:
                this.f41954b.Q0.setLoading(false);
                this.f41955c.presentFragment(this.d);
                return;
            default:
                this.f41954b.Q0.setLoading(false);
                this.f41955c.presentFragment(this.d);
                return;
        }
    }
}
