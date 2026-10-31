package rh;

import org.telegram.ui.TwoStepVerificationActivity;
public final class d implements Runnable {
    public final int f46745a;
    public final i f46746b;
    public final TwoStepVerificationActivity f46747c;

    public d(i iVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f46745a = i10;
        this.f46746b = iVar;
        this.f46747c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f46745a) {
            case 0:
                i iVar = this.f46746b;
                iVar.f47044h0.setLoading(false);
                iVar.presentFragment(this.f46747c);
                return;
            default:
                i iVar2 = this.f46746b;
                iVar2.f47034a0.setLoading(false);
                iVar2.presentFragment(this.f46747c);
                return;
        }
    }
}
