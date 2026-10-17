package rg;

import org.telegram.ui.it0;
import org.telegram.ui.rq0;
public final class c0 implements qg.d1 {
    public final rq0 f45332a;
    public final it0 f45333b;

    public c0(it0 it0Var, rq0 rq0Var) {
        this.f45333b = it0Var;
        this.f45332a = rq0Var;
    }

    @Override
    public final void a() {
        this.f45332a.run();
    }

    @Override
    public final void b() {
        d0 d0Var = this.f45333b.X0;
        if (d0Var != null) {
            d0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        it0 it0Var = this.f45333b;
        if (it0Var.f45511k1) {
            it0Var.f45511k1 = false;
            return;
        }
        it0Var.f45523t1.b(1);
        it0Var.o((qg.m) qg.m.f44585a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        it0 it0Var = this.f45333b;
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
        it0 it0Var = this.f45333b;
        it0Var.F0.f44706a.e();
        it0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        it0 it0Var = this.f45333b;
        if (it0Var.S0 != null) {
            it0Var.s0(null, true);
        }
        it0Var.l1.setViewHidden(true);
    }
}
