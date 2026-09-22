package org.telegram.ui;
public final class td implements Runnable {
    public final int f37752a;
    public final ke f37753b;
    public final bb1 f37754c;
    public final TwoStepVerificationActivity d;

    public td(ke keVar, bb1 bb1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37752a = i10;
        this.f37753b = keVar;
        this.f37754c = bb1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f37752a) {
            case 0:
                this.f37753b.K0.setLoading(false);
                this.f37754c.presentFragment(this.d);
                return;
            case 1:
                this.f37753b.Q0.setLoading(false);
                this.f37754c.presentFragment(this.d);
                return;
            default:
                this.f37753b.Q0.setLoading(false);
                this.f37754c.presentFragment(this.d);
                return;
        }
    }
}
