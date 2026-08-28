package qh;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.li0;
public final class d implements Runnable {
    public final int f46332a;
    public final p f46333b;

    public d(p pVar, int i9) {
        this.f46332a = i9;
        this.f46333b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f46332a) {
            case 0:
                p pVar = this.f46333b;
                pVar.H(2147483646, true, 0, false, 0L);
                li0 li0Var = pVar.K;
                if (li0Var != null) {
                    li0Var.h(false);
                    pVar.K = null;
                    return;
                }
                return;
            case 1:
                p pVar2 = this.f46333b;
                pVar2.H(0, false, 0, false, 0L);
                li0 li0Var2 = pVar2.K;
                if (li0Var2 != null) {
                    li0Var2.h(true);
                    pVar2.K = null;
                    return;
                }
                return;
            case 2:
                p pVar3 = this.f46333b;
                if (!UserConfig.getInstance(pVar3.f46605n).isPremium()) {
                    new zf.x0(pVar3.f27493b.f30099b0, pVar3.getContext(), pVar3.f46605n, 43, true).show();
                    return;
                }
                return;
            case 3:
                p pVar4 = this.f46333b;
                s3 s3Var = pVar4.f46607s;
                if (s3Var != null) {
                    s3Var.setSendEnabled(pVar4.f46606r.M3());
                    return;
                }
                return;
            default:
                this.f46333b.Z();
                return;
        }
    }
}
