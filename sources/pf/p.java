package pf;

import org.telegram.ui.mv;
import org.telegram.ui.z00;

public final class p implements Runnable {

    public final int f45894a;

    public final z f45895b;

    public p(z zVar, int i10) {
        this.f45894a = i10;
        this.f45895b = zVar;
    }

    @Override
    public final void run() {
        switch (this.f45894a) {
            case 0:
                z zVar = this.f45895b;
                z00 z00Var = zVar.f46007w0;
                if (z00Var != null) {
                    ((mv) z00Var).i(false, null, zVar.f46004u0, zVar.f46005v0);
                }
                break;
            default:
                z zVar2 = this.f45895b;
                zVar2.getClass();
                zVar2.f45981c = w.All;
                zVar2.E.clear();
                int i10 = zVar2.B0;
                if (i10 >= 0 && i10 < zVar2.h()) {
                    zVar2.m(zVar2.B0);
                }
                zVar2.Q();
                break;
        }
    }
}
