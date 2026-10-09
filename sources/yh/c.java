package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f52319a;
    public final g f52320b;
    public final TwoStepVerificationActivity f52321c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f52319a = i10;
        this.f52320b = gVar;
        this.f52321c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f52319a) {
            case 0:
                g gVar = this.f52320b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f52321c);
                return;
            default:
                g gVar2 = this.f52320b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f52321c);
                return;
        }
    }
}
