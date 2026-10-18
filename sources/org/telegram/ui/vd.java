package org.telegram.ui;
public final class vd implements Runnable {
    public final int f42197a;
    public final ke f42198b;
    public final r91 f42199c;
    public final TwoStepVerificationActivity d;

    public vd(ke keVar, r91 r91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f42197a = i10;
        this.f42198b = keVar;
        this.f42199c = r91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f42197a) {
            case 0:
                this.f42198b.K0.setLoading(false);
                this.f42199c.presentFragment(this.d);
                return;
            case 1:
                this.f42198b.Q0.setLoading(false);
                this.f42199c.presentFragment(this.d);
                return;
            default:
                this.f42198b.Q0.setLoading(false);
                this.f42199c.presentFragment(this.d);
                return;
        }
    }
}
