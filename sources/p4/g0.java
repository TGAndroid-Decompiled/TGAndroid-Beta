package p4;

import android.os.Bundle;
import c8.u9;
public final class g0 implements m0 {
    public final int f55385a;
    public final n0 f55386b;

    public g0(n0 n0Var, int i7) {
        this.f55385a = i7;
        this.f55386b = n0Var;
    }

    @Override
    public final void f(v vVar) {
        int i7 = this.f55385a;
        n0 n0Var = this.f55386b;
        switch (i7) {
            case 0:
                n0Var.h.n(vVar);
                return;
            case 1:
                d0 d0Var = n0Var.h;
                if (d0Var.f55324t.S0() != null) {
                    w7.s sVar = d0Var.f55310e;
                    d0Var.s(vVar);
                    sVar.getClass();
                    u9.b(new n1(-6));
                    return;
                }
                return;
            case 2:
                n0Var.h.f55324t.V();
                return;
            case 3:
                n0Var.h.f55324t.F();
                return;
            case 4:
                n0Var.h.f55324t.K0();
                return;
            case 5:
                n0Var.h.f55324t.M0();
                return;
            case 6:
                n0Var.h.g(vVar, true);
                return;
            case 7:
                n0Var.h.f55324t.a();
                return;
            case 8:
                n0Var.h.f55324t.stop();
                return;
            case 9:
                d0 d0Var2 = n0Var.h;
                h1 h1Var = d0Var2.f55324t;
                if (h2.l0.c0(h1Var, d0Var2.f55320p)) {
                    h2.l0.J(h1Var);
                    return;
                } else if (h1Var != null && h1Var.q0(1)) {
                    h1Var.b();
                    return;
                } else {
                    return;
                }
            case 10:
                n0Var.h.f55324t.I0();
                return;
            case 11:
                n0Var.h.f55324t.h0();
                return;
            default:
                h1 h1Var2 = n0Var.h.f55324t;
                String str = h2.l0.f13778a;
                if (h1Var2 != null && h1Var2.q0(1)) {
                    h1Var2.b();
                    return;
                }
                return;
        }
    }

    public g0(n0 n0Var, e2.d1 d1Var) {
        this.f55385a = 1;
        this.f55386b = n0Var;
    }

    public g0(n0 n0Var, j1 j1Var, Bundle bundle) {
        this.f55385a = 0;
        this.f55386b = n0Var;
    }
}
