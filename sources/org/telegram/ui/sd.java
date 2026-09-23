package org.telegram.ui;
public final class sd implements Runnable {
    public final int f37242a;
    public final je f37243b;
    public final ra1 f37244c;
    public final TwoStepVerificationActivity d;

    public sd(je jeVar, ra1 ra1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37242a = i10;
        this.f37243b = jeVar;
        this.f37244c = ra1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f37242a) {
            case 0:
                this.f37243b.K0.setLoading(false);
                this.f37244c.presentFragment(this.d);
                return;
            case 1:
                this.f37243b.Q0.setLoading(false);
                this.f37244c.presentFragment(this.d);
                return;
            default:
                this.f37243b.Q0.setLoading(false);
                this.f37244c.presentFragment(this.d);
                return;
        }
    }
}
