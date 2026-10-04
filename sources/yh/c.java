package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f51148a;
    public final g f51149b;
    public final TwoStepVerificationActivity f51150c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f51148a = i10;
        this.f51149b = gVar;
        this.f51150c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f51148a) {
            case 0:
                g gVar = this.f51149b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f51150c);
                return;
            default:
                g gVar2 = this.f51149b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f51150c);
                return;
        }
    }
}
