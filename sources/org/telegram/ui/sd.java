package org.telegram.ui;
public final class sd implements Runnable {
    public final int f37711a;
    public final je f37712b;
    public final sa1 f37713c;
    public final TwoStepVerificationActivity d;

    public sd(je jeVar, sa1 sa1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37711a = i10;
        this.f37712b = jeVar;
        this.f37713c = sa1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f37711a) {
            case 0:
                this.f37712b.K0.setLoading(false);
                this.f37713c.presentFragment(this.d);
                return;
            case 1:
                this.f37712b.Q0.setLoading(false);
                this.f37713c.presentFragment(this.d);
                return;
            default:
                this.f37712b.Q0.setLoading(false);
                this.f37713c.presentFragment(this.d);
                return;
        }
    }
}
