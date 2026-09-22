package org.telegram.ui;
public final class sd implements Runnable {
    public final int f37369a;
    public final je f37370b;
    public final za1 f37371c;
    public final TwoStepVerificationActivity d;

    public sd(je jeVar, za1 za1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37369a = i10;
        this.f37370b = jeVar;
        this.f37371c = za1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f37369a) {
            case 0:
                this.f37370b.K0.setLoading(false);
                this.f37371c.presentFragment(this.d);
                return;
            case 1:
                this.f37370b.Q0.setLoading(false);
                this.f37371c.presentFragment(this.d);
                return;
            default:
                this.f37370b.Q0.setLoading(false);
                this.f37371c.presentFragment(this.d);
                return;
        }
    }
}
