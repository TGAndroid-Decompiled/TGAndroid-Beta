package zf;

import org.telegram.ui.hv;
import org.telegram.ui.p00;
public final class r implements Runnable {
    public final int f55634a;
    public final z f55635b;

    public r(z zVar, int i10) {
        this.f55634a = i10;
        this.f55635b = zVar;
    }

    @Override
    public final void run() {
        switch (this.f55634a) {
            case 0:
                z zVar = this.f55635b;
                p00 p00Var = zVar.A0;
                if (p00Var != null) {
                    ((hv) p00Var).k(false, null, zVar.f55731y0, zVar.f55732z0);
                    return;
                }
                return;
            default:
                w wVar = w.All;
                z zVar2 = this.f55635b;
                zVar2.f55702c = wVar;
                zVar2.I.clear();
                int i10 = zVar2.F0;
                if (i10 >= 0 && i10 < zVar2.b()) {
                    zVar2.g(zVar2.F0);
                }
                zVar2.P();
                return;
        }
    }
}
