package zf;

import org.telegram.ui.iv;
import org.telegram.ui.q00;
public final class r implements Runnable {
    public final int f55616a;
    public final z f55617b;

    public r(z zVar, int i10) {
        this.f55616a = i10;
        this.f55617b = zVar;
    }

    @Override
    public final void run() {
        switch (this.f55616a) {
            case 0:
                z zVar = this.f55617b;
                q00 q00Var = zVar.A0;
                if (q00Var != null) {
                    ((iv) q00Var).k(false, null, zVar.f55713y0, zVar.f55714z0);
                    return;
                }
                return;
            default:
                w wVar = w.All;
                z zVar2 = this.f55617b;
                zVar2.f55684c = wVar;
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
