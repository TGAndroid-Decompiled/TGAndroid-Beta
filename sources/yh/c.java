package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f52442a;
    public final g f52443b;
    public final TwoStepVerificationActivity f52444c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f52442a = i10;
        this.f52443b = gVar;
        this.f52444c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f52442a) {
            case 0:
                g gVar = this.f52443b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f52444c);
                return;
            default:
                g gVar2 = this.f52443b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f52444c);
                return;
        }
    }
}
