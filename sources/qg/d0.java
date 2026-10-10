package qg;

import org.telegram.ui.bu0;
import org.telegram.ui.ir0;
public final class d0 implements pg.d1 {
    public final ir0 f46262a;
    public final bu0 f46263b;

    public d0(bu0 bu0Var, ir0 ir0Var) {
        this.f46263b = bu0Var;
        this.f46262a = ir0Var;
    }

    @Override
    public final void a() {
        this.f46262a.run();
    }

    @Override
    public final void b() {
        e0 e0Var = this.f46263b.X0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        bu0 bu0Var = this.f46263b;
        if (bu0Var.f46423k1) {
            bu0Var.f46423k1 = false;
            return;
        }
        bu0Var.f46435t1.b(1);
        bu0Var.b((pg.m) pg.m.f45732a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        bu0 bu0Var = this.f46263b;
        if (bu0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            bu0Var.s0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        bu0 bu0Var = this.f46263b;
        bu0Var.F0.f45865a.e();
        bu0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        bu0 bu0Var = this.f46263b;
        if (bu0Var.S0 != null) {
            bu0Var.s0(null, true);
        }
        bu0Var.l1.setViewHidden(true);
    }
}
