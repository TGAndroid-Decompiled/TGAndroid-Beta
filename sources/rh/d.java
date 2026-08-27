package rh;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.ni0;

public final class d implements Runnable {

    public final int f47096a;

    public final p f47097b;

    public d(p pVar, int i10) {
        this.f47096a = i10;
        this.f47097b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f47096a) {
            case 0:
                p pVar = this.f47097b;
                pVar.I(2147483646, true, 0, false, 0L);
                ni0 ni0Var = pVar.K;
                if (ni0Var != null) {
                    ni0Var.h(false);
                    pVar.K = null;
                }
                break;
            case 1:
                p pVar2 = this.f47097b;
                pVar2.I(0, false, 0, false, 0L);
                ni0 ni0Var2 = pVar2.K;
                if (ni0Var2 != null) {
                    ni0Var2.h(true);
                    pVar2.K = null;
                }
                break;
            case 2:
                p pVar3 = this.f47097b;
                if (!UserConfig.getInstance(pVar3.f47323n).isPremium()) {
                    new ag.g2(pVar3.f34900b.f28635b0, pVar3.getContext(), pVar3.f47323n, 43, true).show();
                }
                break;
            case 3:
                p pVar4 = this.f47097b;
                t3 t3Var = pVar4.f47325s;
                if (t3Var != null) {
                    t3Var.setSendEnabled(pVar4.f47324r.M3());
                }
                break;
            default:
                this.f47097b.a0();
                break;
        }
    }
}
