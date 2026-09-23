package qg;

import org.telegram.ui.cr0;
import org.telegram.ui.tt0;
public final class f0 implements pg.c1 {
    public final cr0 f41307a;
    public final tt0 f41308b;

    public f0(tt0 tt0Var, cr0 cr0Var) {
        this.f41308b = tt0Var;
        this.f41307a = cr0Var;
    }

    @Override
    public final void a() {
        this.f41307a.run();
    }

    @Override
    public final void b() {
        g0 g0Var = this.f41308b.X0;
        if (g0Var != null) {
            g0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        tt0 tt0Var = this.f41308b;
        if (tt0Var.f41486k1) {
            tt0Var.f41486k1 = false;
            return;
        }
        tt0Var.f41498t1.b(1);
        tt0Var.b((pg.m) pg.m.f40862a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        tt0 tt0Var = this.f41308b;
        if (tt0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            tt0Var.s0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        tt0 tt0Var = this.f41308b;
        tt0Var.F0.f40966a.e();
        tt0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        tt0 tt0Var = this.f41308b;
        if (tt0Var.S0 != null) {
            tt0Var.s0(null, true);
        }
        tt0Var.l1.setViewHidden(true);
    }
}
