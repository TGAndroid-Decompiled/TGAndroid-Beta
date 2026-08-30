package vh;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.si0;
public final class d implements Runnable {
    public final int f45842a;
    public final p f45843b;

    public d(p pVar, int i10) {
        this.f45842a = i10;
        this.f45843b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f45842a) {
            case 0:
                p pVar = this.f45843b;
                pVar.H(2147483646, true, 0, false, 0L);
                si0 si0Var = pVar.L;
                if (si0Var != null) {
                    si0Var.h(false);
                    pVar.L = null;
                    return;
                }
                return;
            case 1:
                p pVar2 = this.f45843b;
                pVar2.H(0, false, 0, false, 0L);
                si0 si0Var2 = pVar2.L;
                if (si0Var2 != null) {
                    si0Var2.h(true);
                    pVar2.L = null;
                    return;
                }
                return;
            case 2:
                p pVar3 = this.f45843b;
                if (!UserConfig.getInstance(pVar3.f46058n).isPremium()) {
                    new eg.o1(pVar3.f24278b.f26689c0, pVar3.getContext(), pVar3.f46058n, 43, true).show();
                    return;
                }
                return;
            case 3:
                p pVar4 = this.f45843b;
                v3 v3Var = pVar4.f46060s;
                if (v3Var != null) {
                    v3Var.setSendEnabled(pVar4.f46059r.M3());
                    return;
                }
                return;
            default:
                this.f45843b.a0();
                return;
        }
    }
}
