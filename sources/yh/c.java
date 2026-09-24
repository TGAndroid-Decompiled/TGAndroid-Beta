package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f47235a;
    public final g f47236b;
    public final TwoStepVerificationActivity f47237c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47235a = i10;
        this.f47236b = gVar;
        this.f47237c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47235a) {
            case 0:
                g gVar = this.f47236b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f47237c);
                return;
            default:
                g gVar2 = this.f47236b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f47237c);
                return;
        }
    }
}
