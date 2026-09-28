package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f47247a;
    public final g f47248b;
    public final TwoStepVerificationActivity f47249c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47247a = i10;
        this.f47248b = gVar;
        this.f47249c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47247a) {
            case 0:
                g gVar = this.f47248b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f47249c);
                return;
            default:
                g gVar2 = this.f47248b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f47249c);
                return;
        }
    }
}
