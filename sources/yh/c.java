package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f52321a;
    public final g f52322b;
    public final TwoStepVerificationActivity f52323c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f52321a = i10;
        this.f52322b = gVar;
        this.f52323c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f52321a) {
            case 0:
                g gVar = this.f52322b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f52323c);
                return;
            default:
                g gVar2 = this.f52322b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f52323c);
                return;
        }
    }
}
