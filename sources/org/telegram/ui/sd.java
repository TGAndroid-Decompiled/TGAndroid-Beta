package org.telegram.ui;
public final class sd implements Runnable {
    public final int f37710a;
    public final je f37711b;
    public final sa1 f37712c;
    public final TwoStepVerificationActivity d;

    public sd(je jeVar, sa1 sa1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37710a = i10;
        this.f37711b = jeVar;
        this.f37712c = sa1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f37710a) {
            case 0:
                this.f37711b.K0.setLoading(false);
                this.f37712c.presentFragment(this.d);
                return;
            case 1:
                this.f37711b.Q0.setLoading(false);
                this.f37712c.presentFragment(this.d);
                return;
            default:
                this.f37711b.Q0.setLoading(false);
                this.f37712c.presentFragment(this.d);
                return;
        }
    }
}
