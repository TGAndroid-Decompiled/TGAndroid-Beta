package uf;

import org.telegram.ui.k10;
import org.telegram.ui.tv;
public final class p implements Runnable {
    public final int f48702a;
    public final z f48703b;

    public p(z zVar, int i10) {
        this.f48702a = i10;
        this.f48703b = zVar;
    }

    @Override
    public final void run() {
        switch (this.f48702a) {
            case 0:
                z zVar = this.f48703b;
                k10 k10Var = zVar.f48817x0;
                if (k10Var != null) {
                    ((tv) k10Var).h(false, null, zVar.f48813v0, zVar.f48815w0);
                    return;
                }
                return;
            default:
                z zVar2 = this.f48703b;
                zVar2.getClass();
                zVar2.f48789c = w.All;
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
