package rg;

import org.telegram.ui.it0;
import org.telegram.ui.sq0;
public final class d0 implements qg.d1 {
    public final sq0 f45737a;
    public final it0 f45738b;

    public d0(it0 it0Var, sq0 sq0Var) {
        this.f45738b = it0Var;
        this.f45737a = sq0Var;
    }

    @Override
    public final void a() {
        this.f45737a.run();
    }

    @Override
    public final void b() {
        e0 e0Var = this.f45738b.X0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        it0 it0Var = this.f45738b;
        if (it0Var.f45901k1) {
            it0Var.f45901k1 = false;
            return;
        }
        it0Var.f45913t1.b(1);
        it0Var.n((qg.m) qg.m.f44983a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        it0 it0Var = this.f45738b;
        if (it0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            it0Var.r0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        it0 it0Var = this.f45738b;
        it0Var.F0.f45104a.e();
        it0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        it0 it0Var = this.f45738b;
        if (it0Var.S0 != null) {
            it0Var.r0(null, true);
        }
        it0Var.l1.setViewHidden(true);
    }
}
