package qh;

import nh.d6;
import org.telegram.ui.Components.c5;
import th.x1;
public final class m0 implements Runnable {
    public final int f46733a;
    public final long f46734b;
    public final Object f46735c;

    public m0(Object obj, long j10, int i10) {
        this.f46733a = i10;
        this.f46735c = obj;
        this.f46734b = j10;
    }

    @Override
    public final void run() {
        switch (this.f46733a) {
            case 0:
                o0 o0Var = (o0) this.f46735c;
                o0Var.f46754i = null;
                o0Var.f46753g.l(this.f46734b);
                o0Var.f46757l++;
                o0Var.a();
                n0 n0Var = o0Var.h;
                if (n0Var != null) {
                    n0Var.k();
                    return;
                }
                return;
            case 1:
                th.p pVar = (th.p) this.f46735c;
                c5.M(pVar.f28403b.f30990b0.getParentActivity(), this.f46734b, new org.telegram.ui.Components.n(pVar, 18), pVar.f28402a);
                return;
            default:
                x1 x1Var = (x1) this.f46735c;
                c5.M(x1Var.getParentActivity(), this.f46734b, new d6(x1Var, 26), x1Var.getResourceProvider());
                return;
        }
    }
}
