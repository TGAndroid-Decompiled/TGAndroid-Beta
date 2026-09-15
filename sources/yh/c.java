package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f47024a;
    public final g f47025b;
    public final TwoStepVerificationActivity f47026c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47024a = i10;
        this.f47025b = gVar;
        this.f47026c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47024a) {
            case 0:
                g gVar = this.f47025b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f47026c);
                return;
            default:
                g gVar2 = this.f47025b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f47026c);
                return;
        }
    }
}
