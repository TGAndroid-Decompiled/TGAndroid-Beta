package org.telegram.ui;
public final class td implements Runnable {
    public final int f37695a;
    public final ke f37696b;
    public final za1 f37697c;
    public final TwoStepVerificationActivity d;

    public td(ke keVar, za1 za1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37695a = i10;
        this.f37696b = keVar;
        this.f37697c = za1Var;
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
