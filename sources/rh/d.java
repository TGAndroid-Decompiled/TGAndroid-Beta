package rh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class d implements Runnable {
    public final int f46759a;
    public final i f46760b;
    public final TwoStepVerificationActivity f46761c;

    public d(i iVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f46759a = i10;
        this.f46760b = iVar;
        this.f46761c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f46759a) {
            case 0:
                i iVar = this.f46760b;
                iVar.f47058h0.setLoading(false);
                iVar.presentFragment(this.f46761c);
                return;
            default:
                i iVar2 = this.f46760b;
                iVar2.f47048a0.setLoading(false);
                iVar2.presentFragment(this.f46761c);
                return;
        }
    }
}
