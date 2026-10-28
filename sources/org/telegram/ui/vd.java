package org.telegram.ui;
public final class vd implements Runnable {
    public final int f44316a;
    public final ke f44317b;
    public final y91 f44318c;
    public final TwoStepVerificationActivity d;

    public vd(ke keVar, y91 y91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f44316a = i10;
        this.f44317b = keVar;
        this.f44318c = y91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f44316a) {
            case 0:
                this.f44317b.A0.setLoading(false);
                this.f44318c.presentFragment(this.d);
                return;
            case 1:
                this.f44317b.G0.setLoading(false);
                this.f44318c.presentFragment(this.d);
                return;
            default:
                this.f44317b.G0.setLoading(false);
                this.f44318c.presentFragment(this.d);
                return;
        }
    }
}
