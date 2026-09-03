package tf;

import org.telegram.ui.l10;
import org.telegram.ui.uv;
public final class p implements Runnable {
    public final int f44875a;
    public final z f44876b;

    public p(z zVar, int i10) {
        this.f44875a = i10;
        this.f44876b = zVar;
    }

    @Override
    public final void run() {
        switch (this.f44875a) {
            case 0:
                z zVar = this.f44876b;
                l10 l10Var = zVar.f44982x0;
                if (l10Var != null) {
                    ((uv) l10Var).h(false, null, zVar.f44978v0, zVar.f44980w0);
                    return;
                }
                return;
            default:
                z zVar2 = this.f44876b;
                zVar2.getClass();
                zVar2.f44955c = w.All;
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
