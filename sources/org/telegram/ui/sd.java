package org.telegram.ui;
public final class sd implements Runnable {
    public final int f37806a;
    public final je f37807b;
    public final sa1 f37808c;
    public final TwoStepVerificationActivity d;

    public sd(je jeVar, sa1 sa1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37806a = i10;
        this.f37807b = jeVar;
        this.f37808c = sa1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f37806a) {
            case 0:
                this.f37807b.K0.setLoading(false);
                this.f37808c.presentFragment(this.d);
                return;
            case 1:
                this.f37807b.Q0.setLoading(false);
                this.f37808c.presentFragment(this.d);
                return;
            default:
                this.f37807b.Q0.setLoading(false);
                this.f37808c.presentFragment(this.d);
                return;
        }
    }
}
