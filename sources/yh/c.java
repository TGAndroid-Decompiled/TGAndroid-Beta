package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f47242a;
    public final g f47243b;
    public final TwoStepVerificationActivity f47244c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47242a = i10;
        this.f47243b = gVar;
        this.f47244c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47242a) {
            case 0:
                g gVar = this.f47243b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f47244c);
                return;
            default:
                g gVar2 = this.f47243b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f47244c);
                return;
        }
    }
}
