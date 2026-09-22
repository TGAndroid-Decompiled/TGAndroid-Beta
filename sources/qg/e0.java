package qg;

import org.telegram.ui.au0;
import org.telegram.ui.jr0;
public final class e0 implements pg.e1 {
    public final jr0 f41657a;
    public final au0 f41658b;

    public e0(au0 au0Var, jr0 jr0Var) {
        this.f41658b = au0Var;
        this.f41657a = jr0Var;
    }

    @Override
    public final void a() {
        this.f41657a.run();
    }

    @Override
    public final void b() {
        f0 f0Var = this.f41658b.X0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        au0 au0Var = this.f41658b;
        if (au0Var.f41824k1) {
            au0Var.f41824k1 = false;
            return;
        }
        au0Var.f41836t1.b(1);
        au0Var.b((pg.m) pg.m.f41218a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        au0 au0Var = this.f41658b;
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
        au0 au0Var = this.f41658b;
        au0Var.F0.f41350a.e();
        au0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        au0 au0Var = this.f41658b;
        if (au0Var.S0 != null) {
            au0Var.r0(null, true);
        }
        au0Var.l1.setViewHidden(true);
    }
}
