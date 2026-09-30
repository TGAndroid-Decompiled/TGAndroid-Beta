package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f47354a;
    public final g f47355b;
    public final TwoStepVerificationActivity f47356c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47354a = i10;
        this.f47355b = gVar;
        this.f47356c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47354a) {
            case 0:
                g gVar = this.f47355b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f47356c);
                return;
            default:
                g gVar2 = this.f47355b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f47356c);
                return;
        }
    }
}
