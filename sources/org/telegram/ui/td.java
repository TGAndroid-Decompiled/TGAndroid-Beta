package org.telegram.ui;
public final class td implements Runnable {
    public final int f41651a;
    public final ie f41652b;
    public final p91 f41653c;
    public final TwoStepVerificationActivity d;

    public td(ie ieVar, p91 p91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41651a = i10;
        this.f41652b = ieVar;
        this.f41653c = p91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41651a) {
            case 0:
                this.f41652b.K0.setLoading(false);
                this.f41653c.presentFragment(this.d);
                return;
            case 1:
                this.f41652b.Q0.setLoading(false);
                this.f41653c.presentFragment(this.d);
                return;
            default:
                this.f41652b.Q0.setLoading(false);
                this.f41653c.presentFragment(this.d);
                return;
        }
    }
}
