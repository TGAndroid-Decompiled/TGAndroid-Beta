package qg;

import org.telegram.ui.au0;
import org.telegram.ui.jr0;
public final class d0 implements pg.d1 {
    public final jr0 f41589a;
    public final au0 f41590b;

    public d0(au0 au0Var, jr0 jr0Var) {
        this.f41590b = au0Var;
        this.f41589a = jr0Var;
    }

    @Override
    public final void a() {
        this.f41589a.run();
    }

    @Override
    public final void b() {
        e0 e0Var = this.f41590b.X0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        au0 au0Var = this.f41590b;
        if (au0Var.f41756k1) {
            au0Var.f41756k1 = false;
            return;
        }
        au0Var.f41768t1.b(1);
        au0Var.b((pg.m) pg.m.f41158a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        au0 au0Var = this.f41590b;
        if (au0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            au0Var.r0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        au0 au0Var = this.f41590b;
        au0Var.F0.f41280a.e();
        au0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        au0 au0Var = this.f41590b;
        if (au0Var.S0 != null) {
            au0Var.r0(null, true);
        }
        au0Var.l1.setViewHidden(true);
    }
}
