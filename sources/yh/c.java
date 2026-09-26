package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f47245a;
    public final g f47246b;
    public final TwoStepVerificationActivity f47247c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47245a = i10;
        this.f47246b = gVar;
        this.f47247c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47245a) {
            case 0:
                g gVar = this.f47246b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f47247c);
                return;
            default:
                g gVar2 = this.f47246b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f47247c);
                return;
        }
    }
}
