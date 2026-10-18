package rg;

import org.telegram.ui.it0;
import org.telegram.ui.sq0;
public final class c0 implements qg.d1 {
    public final sq0 f45306a;
    public final it0 f45307b;

    public c0(it0 it0Var, sq0 sq0Var) {
        this.f45307b = it0Var;
        this.f45306a = sq0Var;
    }

    @Override
    public final void a() {
        this.f45306a.run();
    }

    @Override
    public final void b() {
        d0 d0Var = this.f45307b.X0;
        if (d0Var != null) {
            d0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        it0 it0Var = this.f45307b;
        if (it0Var.f45485k1) {
            it0Var.f45485k1 = false;
            return;
        }
        it0Var.f45497t1.b(1);
        it0Var.o((qg.m) qg.m.f44561a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        it0 it0Var = this.f45307b;
        if (it0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            it0Var.s0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        it0 it0Var = this.f45307b;
        it0Var.F0.f44683a.e();
        it0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        it0 it0Var = this.f45307b;
        if (it0Var.S0 != null) {
            it0Var.s0(null, true);
        }
        it0Var.l1.setViewHidden(true);
    }
}
