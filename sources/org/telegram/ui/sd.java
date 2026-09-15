package org.telegram.ui;
public final class sd implements Runnable {
    public final int f37356a;
    public final je f37357b;
    public final ya1 f37358c;
    public final TwoStepVerificationActivity d;

    public sd(je jeVar, ya1 ya1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37356a = i10;
        this.f37357b = jeVar;
        this.f37358c = ya1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f37356a) {
            case 0:
                this.f37357b.K0.setLoading(false);
                this.f37358c.presentFragment(this.d);
                return;
            case 1:
                this.f37357b.Q0.setLoading(false);
                this.f37358c.presentFragment(this.d);
                return;
            default:
                this.f37357b.Q0.setLoading(false);
                this.f37358c.presentFragment(this.d);
                return;
        }
    }
}
