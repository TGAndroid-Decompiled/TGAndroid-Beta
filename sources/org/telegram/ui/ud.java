package org.telegram.ui;
public final class ud implements Runnable {
    public final int f38045a;
    public final le f38046b;
    public final ab1 f38047c;
    public final TwoStepVerificationActivity d;

    public ud(le leVar, ab1 ab1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f38045a = i10;
        this.f38046b = leVar;
        this.f38047c = ab1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f38045a) {
            case 0:
                this.f38046b.K0.setLoading(false);
                this.f38047c.presentFragment(this.d);
                return;
            case 1:
                this.f38046b.Q0.setLoading(false);
                this.f38047c.presentFragment(this.d);
                return;
            default:
                this.f38046b.Q0.setLoading(false);
                this.f38047c.presentFragment(this.d);
                return;
        }
    }
}
