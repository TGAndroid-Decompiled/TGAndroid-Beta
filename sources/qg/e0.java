package qg;

import org.telegram.ui.ar0;
import org.telegram.ui.st0;
public final class e0 implements pg.e1 {
    public final ar0 f41622a;
    public final st0 f41623b;

    public e0(st0 st0Var, ar0 ar0Var) {
        this.f41623b = st0Var;
        this.f41622a = ar0Var;
    }

    @Override
    public final void a() {
        this.f41622a.run();
    }

    @Override
    public final void b() {
        f0 f0Var = this.f41623b.X0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        st0 st0Var = this.f41623b;
        if (st0Var.f41789k1) {
            st0Var.f41789k1 = false;
            return;
        }
        st0Var.f41801t1.b(1);
        st0Var.b((pg.m) pg.m.f41169a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        st0 st0Var = this.f41623b;
        if (st0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            st0Var.s0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        st0 st0Var = this.f41623b;
        st0Var.F0.f41301a.e();
        st0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        st0 st0Var = this.f41623b;
        if (st0Var.S0 != null) {
            st0Var.s0(null, true);
        }
        st0Var.l1.setViewHidden(true);
    }
}
