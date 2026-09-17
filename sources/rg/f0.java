package rg;

import org.telegram.ui.ir0;
import org.telegram.ui.zt0;
public final class f0 implements qg.b1 {
    public final ir0 f45211a;
    public final zt0 f45212b;

    public f0(zt0 zt0Var, ir0 ir0Var) {
        this.f45212b = zt0Var;
        this.f45211a = ir0Var;
    }

    @Override
    public final void a() {
        this.f45211a.run();
    }

    @Override
    public final void b() {
        g0 g0Var = this.f45212b.X0;
        if (g0Var != null) {
            g0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        zt0 zt0Var = this.f45212b;
        if (zt0Var.f45386k1) {
            zt0Var.f45386k1 = false;
            return;
        }
        zt0Var.f45398t1.b(1);
        zt0Var.o((qg.m) qg.m.f44509a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        zt0 zt0Var = this.f45212b;
        if (zt0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            zt0Var.r0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        zt0 zt0Var = this.f45212b;
        zt0Var.F0.f44618a.f();
        zt0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        zt0 zt0Var = this.f45212b;
        if (zt0Var.S0 != null) {
            zt0Var.r0(null, true);
        }
        zt0Var.l1.setViewHidden(true);
    }
}
