package wh;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.ti0;
public final class e implements Runnable {
    public final int f49707a;
    public final q f49708b;

    public e(q qVar, int i10) {
        this.f49707a = i10;
        this.f49708b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f49707a) {
            case 0:
                q qVar = this.f49708b;
                qVar.H(2147483646, true, 0, false, 0L);
                ti0 ti0Var = qVar.L;
                if (ti0Var != null) {
                    ti0Var.h(false);
                    qVar.L = null;
                    return;
                }
                return;
            case 1:
                q qVar2 = this.f49708b;
                qVar2.H(0, false, 0, false, 0L);
                ti0 ti0Var2 = qVar2.L;
                if (ti0Var2 != null) {
                    ti0Var2.h(true);
                    qVar2.L = null;
                    return;
                }
                return;
            case 2:
                q qVar3 = this.f49708b;
                if (!UserConfig.getInstance(qVar3.f49929n).isPremium()) {
                    new fg.n1(qVar3.f26546b.f29040c0, qVar3.getContext(), qVar3.f49929n, 43, true).show();
                    return;
                }
                return;
            case 3:
                q qVar4 = this.f49708b;
                v3 v3Var = qVar4.f49931s;
                if (v3Var != null) {
                    v3Var.setSendEnabled(qVar4.f49930r.M3());
                    return;
                }
                return;
            default:
                this.f49708b.a0();
                return;
        }
    }
}
