package th;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.ki0;
public final class d implements Runnable {
    public final int f48396a;
    public final p f48397b;

    public d(p pVar, int i10) {
        this.f48396a = i10;
        this.f48397b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f48396a) {
            case 0:
                p pVar = this.f48397b;
                pVar.H(2147483646, true, 0, false, 0L);
                ki0 ki0Var = pVar.K;
                if (ki0Var != null) {
                    ki0Var.h(false);
                    pVar.K = null;
                    return;
                }
                return;
            case 1:
                p pVar2 = this.f48397b;
                pVar2.H(0, false, 0, false, 0L);
                ki0 ki0Var2 = pVar2.K;
                if (ki0Var2 != null) {
                    ki0Var2.h(true);
                    pVar2.K = null;
                    return;
                }
                return;
            case 2:
                p pVar3 = this.f48397b;
                if (!UserConfig.getInstance(pVar3.f48622n).isPremium()) {
                    new cg.p1(pVar3.f28403b.f30990b0, pVar3.getContext(), pVar3.f48622n, 43, true).show();
                    return;
                }
                return;
            case 3:
                p pVar4 = this.f48397b;
                t3 t3Var = pVar4.f48624s;
                if (t3Var != null) {
                    t3Var.setSendEnabled(pVar4.f48623r.M3());
                    return;
                }
                return;
            default:
                this.f48397b.a0();
                return;
        }
    }
}
