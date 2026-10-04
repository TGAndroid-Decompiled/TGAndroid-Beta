package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f51141a;
    public final g f51142b;
    public final TwoStepVerificationActivity f51143c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f51141a = i10;
        this.f51142b = gVar;
        this.f51143c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f51141a) {
            case 0:
                g gVar = this.f51142b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f51143c);
                return;
            default:
                g gVar2 = this.f51142b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f51143c);
                return;
        }
    }
}
