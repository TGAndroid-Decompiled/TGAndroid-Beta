package zh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f51727a;
    public final g f51728b;
    public final TwoStepVerificationActivity f51729c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f51727a = i10;
        this.f51728b = gVar;
        this.f51729c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f51727a) {
            case 0:
                g gVar = this.f51728b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f51729c);
                return;
            default:
                g gVar2 = this.f51728b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f51729c);
                return;
        }
    }
}
