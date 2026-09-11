package zh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f51726a;
    public final g f51727b;
    public final TwoStepVerificationActivity f51728c;

    public c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f51726a = i10;
        this.f51727b = gVar;
        this.f51728c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f51726a) {
            case 0:
                g gVar = this.f51727b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.f51728c);
                return;
            default:
                g gVar2 = this.f51727b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.f51728c);
                return;
        }
    }
}
