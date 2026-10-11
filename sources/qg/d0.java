package qg;

import org.telegram.ui.au0;
import org.telegram.ui.hr0;
public final class d0 implements pg.d1 {
    public final hr0 f46334a;
    public final au0 f46335b;

    public d0(au0 au0Var, hr0 hr0Var) {
        this.f46335b = au0Var;
        this.f46334a = hr0Var;
    }

    @Override
    public final void a() {
        this.f46334a.run();
    }

    @Override
    public final void b() {
        e0 e0Var = this.f46335b.X0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        au0 au0Var = this.f46335b;
        if (au0Var.f46508k1) {
            au0Var.f46508k1 = false;
            return;
        }
        au0Var.f46520t1.b(1);
        au0Var.b((pg.m) pg.m.f45756a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        au0 au0Var = this.f46335b;
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
        au0 au0Var = this.f46335b;
        au0Var.F0.f45889a.e();
        au0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        au0 au0Var = this.f46335b;
        if (au0Var.S0 != null) {
            au0Var.s0(null, true);
        }
        au0Var.l1.setViewHidden(true);
    }
}
