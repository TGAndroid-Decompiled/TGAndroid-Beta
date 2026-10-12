package zh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f50334a;
    public final g f50335b;
    public final TwoStepVerificationActivity f50336c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f50334a = i10;
        this.f50335b = gVar;
        this.f50336c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f50334a) {
            case 0:
                g gVar = this.f50335b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f50336c);
                return;
            default:
                g gVar2 = this.f50335b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f50336c);
                return;
        }
    }
}
