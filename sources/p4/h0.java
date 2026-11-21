package p4;

import android.os.Bundle;
import c8.t9;
public final class h0 implements m0 {
    public final int f55309a;
    public final n0 f55310b;

    public h0(n0 n0Var, int i7) {
        this.f55309a = i7;
        this.f55310b = n0Var;
    }

    @Override
    public final void f(v vVar) {
        int i7 = this.f55309a;
        n0 n0Var = this.f55310b;
        switch (i7) {
            case 0:
                n0Var.h.n(vVar);
                return;
            case 1:
                e0 e0Var = n0Var.h;
                if (e0Var.f55245t.S0() != null) {
                    w7.s sVar = e0Var.f55231e;
                    e0Var.s(vVar);
                    sVar.getClass();
                    t9.b(new o1(-6));
                    return;
                }
                return;
            case 2:
                n0Var.h.f55245t.U();
                return;
            case 3:
                n0Var.h.f55245t.E();
                return;
            case 4:
                n0Var.h.f55245t.J0();
                return;
            case 5:
                n0Var.h.f55245t.L0();
                return;
            case 6:
                n0Var.h.g(vVar, true);
                return;
            case 7:
                n0Var.h.f55245t.a();
                return;
            case 8:
                n0Var.h.f55245t.stop();
                return;
            case 9:
                e0 e0Var2 = n0Var.h;
                i1 i1Var = e0Var2.f55245t;
                if (h2.l0.c0(i1Var, e0Var2.f55241p)) {
                    h2.l0.J(i1Var);
                    return;
                } else if (i1Var != null && i1Var.p0(1)) {
                    i1Var.b();
                    return;
                } else {
                    return;
                }
            case 10:
                n0Var.h.f55245t.H0();
                return;
            case 11:
                n0Var.h.f55245t.g0();
                return;
            default:
                i1 i1Var2 = n0Var.h.f55245t;
                String str = h2.l0.f13812a;
                if (i1Var2 != null && i1Var2.p0(1)) {
                    i1Var2.b();
                    return;
                }
                return;
        }
    }

    public h0(n0 n0Var, e2.d1 d1Var) {
        this.f55309a = 1;
        this.f55310b = n0Var;
    }

    public h0(n0 n0Var, k1 k1Var, Bundle bundle) {
        this.f55309a = 0;
        this.f55310b = n0Var;
    }
}
