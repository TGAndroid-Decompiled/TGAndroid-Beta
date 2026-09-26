package org.telegram.ui;
public final class sd implements Runnable {
    public final int f37709a;
    public final je f37710b;
    public final sa1 f37711c;
    public final TwoStepVerificationActivity d;

    public sd(je jeVar, sa1 sa1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37709a = i10;
        this.f37710b = jeVar;
        this.f37711c = sa1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f37709a) {
            case 0:
                this.f37710b.K0.setLoading(false);
                this.f37711c.presentFragment(this.d);
                return;
            case 1:
                this.f37710b.Q0.setLoading(false);
                this.f37711c.presentFragment(this.d);
                return;
            default:
                this.f37710b.Q0.setLoading(false);
                this.f37711c.presentFragment(this.d);
                return;
        }
    }
}
