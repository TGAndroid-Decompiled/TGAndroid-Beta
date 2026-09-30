package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f47248a;
    public final g f47249b;
    public final TwoStepVerificationActivity f47250c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47248a = i10;
        this.f47249b = gVar;
        this.f47250c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47248a) {
            case 0:
                g gVar = this.f47249b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f47250c);
                return;
            default:
                g gVar2 = this.f47249b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f47250c);
                return;
        }
    }
}
