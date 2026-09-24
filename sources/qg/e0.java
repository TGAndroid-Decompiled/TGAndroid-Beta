package qg;

import org.telegram.ui.ar0;
import org.telegram.ui.st0;
public final class e0 implements pg.e1 {
    public final ar0 f41608a;
    public final st0 f41609b;

    public e0(st0 st0Var, ar0 ar0Var) {
        this.f41609b = st0Var;
        this.f41608a = ar0Var;
    }

    @Override
    public final void a() {
        this.f41608a.run();
    }

    @Override
    public final void b() {
        f0 f0Var = this.f41609b.X0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        st0 st0Var = this.f41609b;
        if (st0Var.f41775k1) {
            st0Var.f41775k1 = false;
            return;
        }
        st0Var.f41787t1.b(1);
        st0Var.b((pg.m) pg.m.f41155a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        st0 st0Var = this.f41609b;
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
        st0 st0Var = this.f41609b;
        st0Var.F0.f41287a.e();
        st0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        st0 st0Var = this.f41609b;
        if (st0Var.S0 != null) {
            st0Var.s0(null, true);
        }
        st0Var.l1.setViewHidden(true);
    }
}
