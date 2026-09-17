package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f47047a;
    public final g f47048b;
    public final TwoStepVerificationActivity f47049c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47047a = i10;
        this.f47048b = gVar;
        this.f47049c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47047a) {
            case 0:
                g gVar = this.f47048b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f47049c);
                return;
            default:
                g gVar2 = this.f47048b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f47049c);
                return;
        }
    }
}
