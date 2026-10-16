package zh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f50335a;
    public final g f50336b;
    public final TwoStepVerificationActivity f50337c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f50335a = i10;
        this.f50336b = gVar;
        this.f50337c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f50335a) {
            case 0:
                g gVar = this.f50336b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f50337c);
                return;
            default:
                g gVar2 = this.f50336b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f50337c);
                return;
        }
    }
}
