package yh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class d implements Runnable {
    public final int f51205a;
    public final h f51206b;
    public final TwoStepVerificationActivity f51207c;

    public d(h hVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f51205a = i10;
        this.f51206b = hVar;
        this.f51207c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f51205a) {
            case 0:
                h hVar = this.f51206b;
                hVar.f51378h0.setLoading(false);
                hVar.presentFragment(this.f51207c);
                return;
            default:
                h hVar2 = this.f51206b;
                hVar2.f51367a0.setLoading(false);
                hVar2.presentFragment(this.f51207c);
                return;
        }
    }
}
