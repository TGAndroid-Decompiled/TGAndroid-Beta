package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f52545a;
    public final g f52546b;
    public final TwoStepVerificationActivity f52547c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f52545a = i10;
        this.f52546b = gVar;
        this.f52547c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f52545a) {
            case 0:
                g gVar = this.f52546b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f52547c);
                return;
            default:
                g gVar2 = this.f52546b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f52547c);
                return;
        }
    }
}
