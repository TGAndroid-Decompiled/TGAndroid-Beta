package org.telegram.ui;
public final class td implements Runnable {
    public final int f42005a;
    public final ie f42006b;
    public final t91 f42007c;
    public final TwoStepVerificationActivity d;

    public td(ie ieVar, t91 t91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f42005a = i10;
        this.f42006b = ieVar;
        this.f42007c = t91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f42005a) {
            case 0:
                this.f42006b.K0.setLoading(false);
                this.f42007c.presentFragment(this.d);
                return;
            case 1:
                this.f42006b.Q0.setLoading(false);
                this.f42007c.presentFragment(this.d);
                return;
            default:
                this.f42006b.Q0.setLoading(false);
                this.f42007c.presentFragment(this.d);
                return;
        }
    }
}
