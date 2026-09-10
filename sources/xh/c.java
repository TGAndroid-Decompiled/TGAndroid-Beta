package xh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class c implements Runnable {
    public final int f45291a;
    public final h f45292b;
    public final TwoStepVerificationActivity f45293c;

    public c(h hVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f45291a = i10;
        this.f45292b = hVar;
        this.f45293c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f45291a) {
            case 0:
                h hVar = this.f45292b;
                hVar.Y.setLoading(false);
                hVar.presentFragment(this.f45293c);
                return;
            default:
                h hVar2 = this.f45292b;
                hVar2.R.setLoading(false);
                hVar2.presentFragment(this.f45293c);
                return;
        }
    }
}
