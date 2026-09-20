package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f47285a;
    public final g f47286b;
    public final TwoStepVerificationActivity f47287c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47285a = i10;
        this.f47286b = gVar;
        this.f47287c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47285a) {
            case 0:
                g gVar = this.f47286b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f47287c);
                return;
            default:
                g gVar2 = this.f47286b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f47287c);
                return;
        }
    }
}
