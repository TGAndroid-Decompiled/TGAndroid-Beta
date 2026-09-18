package qg;

import org.telegram.ui.cu0;
import org.telegram.ui.kr0;
public final class f0 implements pg.b1 {
    public final kr0 f41382a;
    public final cu0 f41383b;

    public f0(cu0 cu0Var, kr0 kr0Var) {
        this.f41383b = cu0Var;
        this.f41382a = kr0Var;
    }

    @Override
    public final void a() {
        this.f41382a.run();
    }

    @Override
    public final void b() {
        g0 g0Var = this.f41383b.X0;
        if (g0Var != null) {
            g0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        cu0 cu0Var = this.f41383b;
        if (cu0Var.f41561k1) {
            cu0Var.f41561k1 = false;
            return;
        }
        cu0Var.f41573t1.b(1);
        cu0Var.b((pg.m) pg.m.f40939a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        cu0 cu0Var = this.f41383b;
        if (cu0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            cu0Var.r0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        cu0 cu0Var = this.f41383b;
        cu0Var.F0.f41039a.e();
        cu0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        cu0 cu0Var = this.f41383b;
        if (cu0Var.S0 != null) {
            cu0Var.r0(null, true);
        }
        cu0Var.l1.setViewHidden(true);
    }
}
