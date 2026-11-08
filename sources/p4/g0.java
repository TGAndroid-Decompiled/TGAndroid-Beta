package p4;

import android.os.Bundle;
import c8.s9;
public final class g0 implements l0 {
    public final int f53278a;
    public final m0 f53279b;

    public g0(m0 m0Var, int i7) {
        this.f53278a = i7;
        this.f53279b = m0Var;
    }

    @Override
    public final void f(v vVar) {
        int i7 = this.f53278a;
        m0 m0Var = this.f53279b;
        switch (i7) {
            case 0:
                m0Var.h.n(vVar);
                return;
            case 1:
                d0 d0Var = m0Var.h;
                if (d0Var.f53218t.S0() != null) {
                    pb.b bVar = d0Var.f53204e;
                    d0Var.s(vVar);
                    bVar.getClass();
                    s9.b(new m1(-6));
                    return;
                }
                return;
            case 2:
                m0Var.h.f53218t.U();
                return;
            case 3:
                m0Var.h.f53218t.E();
                return;
            case 4:
                m0Var.h.f53218t.J0();
                return;
            case 5:
                m0Var.h.f53218t.L0();
                return;
            case 6:
                m0Var.h.g(vVar, true);
                return;
            case 7:
                m0Var.h.f53218t.a();
                return;
            case 8:
                m0Var.h.f53218t.stop();
                return;
            case 9:
                d0 d0Var2 = m0Var.h;
                g1 g1Var = d0Var2.f53218t;
                if (h2.m0.c0(g1Var, d0Var2.f53214p)) {
                    h2.m0.J(g1Var);
                    return;
                } else if (g1Var != null && g1Var.p0(1)) {
                    g1Var.b();
                    return;
                } else {
                    return;
                }
            case 10:
                m0Var.h.f53218t.H0();
                return;
            case 11:
                m0Var.h.f53218t.g0();
                return;
            default:
                g1 g1Var2 = m0Var.h.f53218t;
                String str = h2.m0.f14112a;
                if (g1Var2 != null && g1Var2.p0(1)) {
                    g1Var2.b();
                    return;
                }
                return;
        }
    }

    public g0(m0 m0Var, e2.d1 d1Var) {
        this.f53278a = 1;
        this.f53279b = m0Var;
    }

    public g0(m0 m0Var, i1 i1Var, Bundle bundle) {
        this.f53278a = 0;
        this.f53279b = m0Var;
    }
}
