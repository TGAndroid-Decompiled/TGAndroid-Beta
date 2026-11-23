package p4;

import android.os.Bundle;
import c8.u9;
public final class g0 implements l0 {
    public final int f55232a;
    public final m0 f55233b;

    public g0(m0 m0Var, int i7) {
        this.f55232a = i7;
        this.f55233b = m0Var;
    }

    @Override
    public final void f(v vVar) {
        int i7 = this.f55232a;
        m0 m0Var = this.f55233b;
        switch (i7) {
            case 0:
                m0Var.h.n(vVar);
                return;
            case 1:
                d0 d0Var = m0Var.h;
                if (d0Var.f55205t.S0() != null) {
                    w7.s sVar = d0Var.f55191e;
                    d0Var.s(vVar);
                    sVar.getClass();
                    u9.b(new o1(-6));
                    return;
                }
                return;
            case 2:
                m0Var.h.f55205t.U();
                return;
            case 3:
                m0Var.h.f55205t.E();
                return;
            case 4:
                m0Var.h.f55205t.J0();
                return;
            case 5:
                m0Var.h.f55205t.L0();
                return;
            case 6:
                m0Var.h.g(vVar, true);
                return;
            case 7:
                m0Var.h.f55205t.a();
                return;
            case 8:
                m0Var.h.f55205t.stop();
                return;
            case 9:
                d0 d0Var2 = m0Var.h;
                i1 i1Var = d0Var2.f55205t;
                if (h2.l0.c0(i1Var, d0Var2.f55201p)) {
                    h2.l0.J(i1Var);
                    return;
                } else if (i1Var != null && i1Var.p0(1)) {
                    i1Var.b();
                    return;
                } else {
                    return;
                }
            case 10:
                m0Var.h.f55205t.H0();
                return;
            case 11:
                m0Var.h.f55205t.g0();
                return;
            default:
                i1 i1Var2 = m0Var.h.f55205t;
                String str = h2.l0.f13778a;
                if (i1Var2 != null && i1Var2.p0(1)) {
                    i1Var2.b();
                    return;
                }
                return;
        }
    }

    public g0(m0 m0Var, e2.d1 d1Var) {
        this.f55232a = 1;
        this.f55233b = m0Var;
    }

    public g0(m0 m0Var, k1 k1Var, Bundle bundle) {
        this.f55232a = 0;
        this.f55233b = m0Var;
    }
}
