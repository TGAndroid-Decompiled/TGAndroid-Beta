package p4;

import android.os.Bundle;
import c8.r9;
public final class g0 implements l0 {
    public final int f54695a;
    public final m0 f54696b;

    public g0(m0 m0Var, int i7) {
        this.f54695a = i7;
        this.f54696b = m0Var;
    }

    @Override
    public final void f(v vVar) {
        int i7 = this.f54695a;
        m0 m0Var = this.f54696b;
        switch (i7) {
            case 0:
                m0Var.h.n(vVar);
                return;
            case 1:
                d0 d0Var = m0Var.h;
                if (d0Var.f54635t.S0() != null) {
                    w7.s sVar = d0Var.f54621e;
                    d0Var.s(vVar);
                    sVar.getClass();
                    r9.b(new m1(-6));
                    return;
                }
                return;
            case 2:
                m0Var.h.f54635t.U();
                return;
            case 3:
                m0Var.h.f54635t.E();
                return;
            case 4:
                m0Var.h.f54635t.J0();
                return;
            case 5:
                m0Var.h.f54635t.L0();
                return;
            case 6:
                m0Var.h.g(vVar, true);
                return;
            case 7:
                m0Var.h.f54635t.a();
                return;
            case 8:
                m0Var.h.f54635t.stop();
                return;
            case 9:
                d0 d0Var2 = m0Var.h;
                g1 g1Var = d0Var2.f54635t;
                if (h2.l0.c0(g1Var, d0Var2.f54631p)) {
                    h2.l0.J(g1Var);
                    return;
                } else if (g1Var != null && g1Var.p0(1)) {
                    g1Var.b();
                    return;
                } else {
                    return;
                }
            case 10:
                m0Var.h.f54635t.H0();
                return;
            case 11:
                m0Var.h.f54635t.g0();
                return;
            default:
                g1 g1Var2 = m0Var.h.f54635t;
                String str = h2.l0.f13471a;
                if (g1Var2 != null && g1Var2.p0(1)) {
                    g1Var2.b();
                    return;
                }
                return;
        }
    }

    public g0(m0 m0Var, e2.d1 d1Var) {
        this.f54695a = 1;
        this.f54696b = m0Var;
    }

    public g0(m0 m0Var, i1 i1Var, Bundle bundle) {
        this.f54695a = 0;
        this.f54696b = m0Var;
    }
}
