package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f52408a;
    public final g f52409b;
    public final TwoStepVerificationActivity f52410c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f52408a = i10;
        this.f52409b = gVar;
        this.f52410c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f52408a) {
            case 0:
                g gVar = this.f52409b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f52410c);
                return;
            default:
                g gVar2 = this.f52409b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f52410c);
                return;
        }
    }
}
