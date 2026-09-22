package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f46974a;
    public final g f46975b;
    public final TwoStepVerificationActivity f46976c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f46974a = i10;
        this.f46975b = gVar;
        this.f46976c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f46974a) {
            case 0:
                g gVar = this.f46975b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f46976c);
                return;
            default:
                g gVar2 = this.f46975b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f46976c);
                return;
        }
    }
}
