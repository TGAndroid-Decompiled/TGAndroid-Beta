package tf;

import org.telegram.ui.k10;
import org.telegram.ui.sv;
public final class p implements Runnable {
    public final int f44813a;
    public final z f44814b;

    public p(z zVar, int i10) {
        this.f44813a = i10;
        this.f44814b = zVar;
    }

    @Override
    public final void run() {
        switch (this.f44813a) {
            case 0:
                z zVar = this.f44814b;
                k10 k10Var = zVar.f44920x0;
                if (k10Var != null) {
                    ((sv) k10Var).h(false, null, zVar.f44916v0, zVar.f44918w0);
                    return;
                }
                return;
            default:
                z zVar2 = this.f44814b;
                zVar2.getClass();
                zVar2.f44893c = w.All;
                zVar2.F.clear();
                int i10 = zVar2.C0;
                if (i10 >= 0 && i10 < zVar2.h()) {
                    zVar2.m(zVar2.C0);
                }
                zVar2.Q();
                return;
        }
    }
}
