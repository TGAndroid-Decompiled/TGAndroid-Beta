package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f47052a;
    public final g f47053b;
    public final TwoStepVerificationActivity f47054c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47052a = i10;
        this.f47053b = gVar;
        this.f47054c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47052a) {
            case 0:
                g gVar = this.f47053b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f47054c);
                return;
            default:
                g gVar2 = this.f47053b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f47054c);
                return;
        }
    }
}
