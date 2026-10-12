package qg;

import org.telegram.ui.cu0;
import org.telegram.ui.kr0;
public final class d0 implements pg.c1 {
    public final kr0 f46163a;
    public final cu0 f46164b;

    public d0(cu0 cu0Var, kr0 kr0Var) {
        this.f46164b = cu0Var;
        this.f46163a = kr0Var;
    }

    @Override
    public final void a() {
        this.f46163a.run();
    }

    @Override
    public final void b() {
        e0 e0Var = this.f46164b.X0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        cu0 cu0Var = this.f46164b;
        if (cu0Var.f46324k1) {
            cu0Var.f46324k1 = false;
            return;
        }
        cu0Var.f46336t1.b(1);
        cu0Var.b((pg.m) pg.m.f45587a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        cu0 cu0Var = this.f46164b;
        if (cu0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            cu0Var.s0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        cu0 cu0Var = this.f46164b;
        cu0Var.F0.f45700a.e();
        cu0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        cu0 cu0Var = this.f46164b;
        if (cu0Var.S0 != null) {
            cu0Var.s0(null, true);
        }
        cu0Var.l1.setViewHidden(true);
    }
}
