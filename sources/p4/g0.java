package p4;

import android.os.Bundle;
import c8.t9;
public final class g0 implements l0 {
    public final int f55222a;
    public final m0 f55223b;

    public g0(m0 m0Var, int i7) {
        this.f55222a = i7;
        this.f55223b = m0Var;
    }

    @Override
    public final void f(v vVar) {
        int i7 = this.f55222a;
        m0 m0Var = this.f55223b;
        switch (i7) {
            case 0:
                m0Var.h.n(vVar);
                return;
            case 1:
                d0 d0Var = m0Var.h;
                if (d0Var.f55195t.S0() != null) {
                    w7.s sVar = d0Var.f55181e;
                    d0Var.s(vVar);
                    sVar.getClass();
                    t9.b(new o1(-6));
                    return;
                }
                return;
            case 2:
                m0Var.h.f55195t.U();
                return;
            case 3:
                m0Var.h.f55195t.E();
                return;
            case 4:
                m0Var.h.f55195t.J0();
                return;
            case 5:
                m0Var.h.f55195t.L0();
                return;
            case 6:
                m0Var.h.g(vVar, true);
                return;
            case 7:
                m0Var.h.f55195t.a();
                return;
            case 8:
                m0Var.h.f55195t.stop();
                return;
            case 9:
                d0 d0Var2 = m0Var.h;
                i1 i1Var = d0Var2.f55195t;
                if (h2.l0.c0(i1Var, d0Var2.f55191p)) {
                    h2.l0.J(i1Var);
                    return;
                } else if (i1Var != null && i1Var.p0(1)) {
                    i1Var.b();
                    return;
                } else {
                    return;
                }
            case 10:
                m0Var.h.f55195t.H0();
                return;
            case 11:
                m0Var.h.f55195t.g0();
                return;
            default:
                i1 i1Var2 = m0Var.h.f55195t;
                String str = h2.l0.f13786a;
                if (i1Var2 != null && i1Var2.p0(1)) {
                    i1Var2.b();
                    return;
                }
                return;
        }
    }

    public g0(m0 m0Var, e2.d1 d1Var) {
        this.f55222a = 1;
        this.f55223b = m0Var;
    }

    public g0(m0 m0Var, k1 k1Var, Bundle bundle) {
        this.f55222a = 0;
        this.f55223b = m0Var;
    }
}
