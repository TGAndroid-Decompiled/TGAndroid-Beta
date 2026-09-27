package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f47297a;
    public final g f47298b;
    public final TwoStepVerificationActivity f47299c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47297a = i10;
        this.f47298b = gVar;
        this.f47299c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47297a) {
            case 0:
                g gVar = this.f47298b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f47299c);
                return;
            default:
                g gVar2 = this.f47298b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f47299c);
                return;
        }
    }
}
