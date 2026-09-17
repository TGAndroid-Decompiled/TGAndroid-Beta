package zh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f51758a;
    public final g f51759b;
    public final TwoStepVerificationActivity f51760c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f51758a = i10;
        this.f51759b = gVar;
        this.f51760c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f51758a) {
            case 0:
                g gVar = this.f51759b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f51760c);
                return;
            default:
                g gVar2 = this.f51759b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f51760c);
                return;
        }
    }
}
