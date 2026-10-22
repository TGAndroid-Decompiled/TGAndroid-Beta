package org.telegram.ui;
public final class td implements Runnable {
    public final int f41650a;
    public final ie f41651b;
    public final p91 f41652c;
    public final TwoStepVerificationActivity d;

    public td(ie ieVar, p91 p91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41650a = i10;
        this.f41651b = ieVar;
        this.f41652c = p91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41650a) {
            case 0:
                this.f41651b.K0.setLoading(false);
                this.f41652c.presentFragment(this.d);
                return;
            case 1:
                this.f41651b.Q0.setLoading(false);
                this.f41652c.presentFragment(this.d);
                return;
            default:
                this.f41651b.Q0.setLoading(false);
                this.f41652c.presentFragment(this.d);
                return;
        }
    }
}
