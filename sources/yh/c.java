package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f47246a;
    public final g f47247b;
    public final TwoStepVerificationActivity f47248c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47246a = i10;
        this.f47247b = gVar;
        this.f47248c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47246a) {
            case 0:
                g gVar = this.f47247b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f47248c);
                return;
            default:
                g gVar2 = this.f47247b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f47248c);
                return;
        }
    }
}
