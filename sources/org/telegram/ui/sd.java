package org.telegram.ui;
public final class sd implements Runnable {
    public final int f37695a;
    public final je f37696b;
    public final sa1 f37697c;
    public final TwoStepVerificationActivity d;

    public sd(je jeVar, sa1 sa1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37695a = i10;
        this.f37696b = jeVar;
        this.f37697c = sa1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f37695a) {
            case 0:
                this.f37696b.K0.setLoading(false);
                this.f37697c.presentFragment(this.d);
                return;
            case 1:
                this.f37696b.Q0.setLoading(false);
                this.f37697c.presentFragment(this.d);
                return;
            default:
                this.f37696b.Q0.setLoading(false);
                this.f37697c.presentFragment(this.d);
                return;
        }
    }
}
