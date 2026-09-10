package pg;

import org.telegram.ui.ir0;
import org.telegram.ui.zt0;
public final class d0 implements og.g1 {
    public final ir0 f39975a;
    public final zt0 f39976b;

    public d0(zt0 zt0Var, ir0 ir0Var) {
        this.f39976b = zt0Var;
        this.f39975a = ir0Var;
    }

    @Override
    public final void a() {
        this.f39975a.run();
    }

    @Override
    public final void b() {
        e0 e0Var = this.f39976b.X0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        zt0 zt0Var = this.f39976b;
        if (zt0Var.f40142k1) {
            zt0Var.f40142k1 = false;
            return;
        }
        zt0Var.f40154t1.b(1);
        zt0Var.B((og.m) og.m.f14420a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        zt0 zt0Var = this.f39976b;
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
        zt0 zt0Var = this.f39976b;
        zt0Var.F0.f14570a.e();
        zt0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        zt0 zt0Var = this.f39976b;
        if (zt0Var.S0 != null) {
            zt0Var.r0(null, true);
        }
        zt0Var.l1.setViewHidden(true);
    }
}
