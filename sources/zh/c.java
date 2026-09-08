package zh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f51757a;
    public final g f51758b;
    public final TwoStepVerificationActivity f51759c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f51757a = i10;
        this.f51758b = gVar;
        this.f51759c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f51757a) {
            case 0:
                g gVar = this.f51758b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f51759c);
                return;
            default:
                g gVar2 = this.f51758b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f51759c);
                return;
        }
    }
}
