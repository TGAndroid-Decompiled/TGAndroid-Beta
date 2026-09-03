package vh;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.ui0;
public final class e implements Runnable {
    public final int f45939a;
    public final q f45940b;

    public e(q qVar, int i10) {
        this.f45939a = i10;
        this.f45940b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f45939a) {
            case 0:
                q qVar = this.f45940b;
                qVar.H(2147483646, true, 0, false, 0L);
                ui0 ui0Var = qVar.L;
                if (ui0Var != null) {
                    ui0Var.h(false);
                    qVar.L = null;
                    return;
                }
                return;
            case 1:
                q qVar2 = this.f45940b;
                qVar2.H(0, false, 0, false, 0L);
                ui0 ui0Var2 = qVar2.L;
                if (ui0Var2 != null) {
                    ui0Var2.h(true);
                    qVar2.L = null;
                    return;
                }
                return;
            case 2:
                q qVar3 = this.f45940b;
                if (!UserConfig.getInstance(qVar3.f46155n).isPremium()) {
                    new eg.o1(qVar3.f24282b.f26685c0, qVar3.getContext(), qVar3.f46155n, 43, true).show();
                    return;
                }
                return;
            case 3:
                q qVar4 = this.f45940b;
                w3 w3Var = qVar4.f46157s;
                if (w3Var != null) {
                    w3Var.setSendEnabled(qVar4.f46156r.L3());
                    return;
                }
                return;
            default:
                this.f45940b.a0();
                return;
        }
    }
}
