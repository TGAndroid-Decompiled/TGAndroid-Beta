package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f52365a;
    public final g f52366b;
    public final TwoStepVerificationActivity f52367c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f52365a = i10;
        this.f52366b = gVar;
        this.f52367c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f52365a) {
            case 0:
                g gVar = this.f52366b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f52367c);
                return;
            default:
                g gVar2 = this.f52366b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f52367c);
                return;
        }
    }
}
