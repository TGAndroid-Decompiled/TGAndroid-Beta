package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f51142a;
    public final g f51143b;
    public final TwoStepVerificationActivity f51144c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f51142a = i10;
        this.f51143b = gVar;
        this.f51144c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f51142a) {
            case 0:
                g gVar = this.f51143b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f51144c);
                return;
            default:
                g gVar2 = this.f51143b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f51144c);
                return;
        }
    }
}
