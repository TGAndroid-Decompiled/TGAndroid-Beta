package rg;

import org.telegram.ui.hu0;
import org.telegram.ui.or0;
public final class e0 implements qg.b1 {
    public final or0 f44241a;
    public final hu0 f44242b;

    public e0(hu0 hu0Var, or0 or0Var) {
        this.f44242b = hu0Var;
        this.f44241a = or0Var;
    }

    @Override
    public final void a() {
        this.f44241a.run();
    }

    @Override
    public final void b() {
        f0 f0Var = this.f44242b.X0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        hu0 hu0Var = this.f44242b;
        if (hu0Var.f44419k1) {
            hu0Var.f44419k1 = false;
            return;
        }
        hu0Var.f44431t1.b(1);
        hu0Var.o((qg.m) qg.m.f43485a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        hu0 hu0Var = this.f44242b;
        if (hu0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            hu0Var.s0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        hu0 hu0Var = this.f44242b;
        hu0Var.F0.f43585a.f();
        hu0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        hu0 hu0Var = this.f44242b;
        if (hu0Var.S0 != null) {
            hu0Var.s0(null, true);
        }
        hu0Var.l1.setViewHidden(true);
    }
}
