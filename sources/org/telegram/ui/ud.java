package org.telegram.ui;
public final class ud implements Runnable {
    public final int f38912a;
    public final ke f38913b;
    public final ga1 f38914c;
    public final TwoStepVerificationActivity d;

    public ud(ke keVar, ga1 ga1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f38912a = i10;
        this.f38913b = keVar;
        this.f38914c = ga1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f38912a) {
            case 0:
                this.f38913b.H0.setLoading(false);
                this.f38914c.presentFragment(this.d);
                return;
            case 1:
                this.f38913b.N0.setLoading(false);
                this.f38914c.presentFragment(this.d);
                return;
            default:
                this.f38913b.N0.setLoading(false);
                this.f38914c.presentFragment(this.d);
                return;
        }
    }
}
