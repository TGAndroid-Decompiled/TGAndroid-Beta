package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f47306a;
    public final g f47307b;
    public final TwoStepVerificationActivity f47308c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47306a = i10;
        this.f47307b = gVar;
        this.f47308c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47306a) {
            case 0:
                g gVar = this.f47307b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f47308c);
                return;
            default:
                g gVar2 = this.f47307b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f47308c);
                return;
        }
    }
}
