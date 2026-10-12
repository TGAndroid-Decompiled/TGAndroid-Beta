package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f52558a;
    public final g f52559b;
    public final TwoStepVerificationActivity f52560c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f52558a = i10;
        this.f52559b = gVar;
        this.f52560c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f52558a) {
            case 0:
                g gVar = this.f52559b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f52560c);
                return;
            default:
                g gVar2 = this.f52559b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f52560c);
                return;
        }
    }
}
