package qg;

import org.telegram.ui.au0;
import org.telegram.ui.ir0;
public final class f0 implements pg.b1 {
    public final ir0 f41351a;
    public final au0 f41352b;

    public f0(au0 au0Var, ir0 ir0Var) {
        this.f41352b = au0Var;
        this.f41351a = ir0Var;
    }

    @Override
    public final void a() {
        this.f41351a.run();
    }

    @Override
    public final void b() {
        g0 g0Var = this.f41352b.X0;
        if (g0Var != null) {
            g0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        au0 au0Var = this.f41352b;
        if (au0Var.f41530k1) {
            au0Var.f41530k1 = false;
            return;
        }
        au0Var.f41542t1.b(1);
        au0Var.b((pg.m) pg.m.f40908a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        au0 au0Var = this.f41352b;
        if (au0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            au0Var.s0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        au0 au0Var = this.f41352b;
        au0Var.F0.f41008a.e();
        au0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        au0 au0Var = this.f41352b;
        if (au0Var.S0 != null) {
            au0Var.s0(null, true);
        }
        au0Var.l1.setViewHidden(true);
    }
}
