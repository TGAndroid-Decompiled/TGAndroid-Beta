package rg;

import org.telegram.ui.jt0;
import org.telegram.ui.tq0;
public final class d0 implements qg.d1 {
    public final tq0 f45738a;
    public final jt0 f45739b;

    public d0(jt0 jt0Var, tq0 tq0Var) {
        this.f45739b = jt0Var;
        this.f45738a = tq0Var;
    }

    @Override
    public final void a() {
        this.f45738a.run();
    }

    @Override
    public final void b() {
        e0 e0Var = this.f45739b.X0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        jt0 jt0Var = this.f45739b;
        if (jt0Var.f45902k1) {
            jt0Var.f45902k1 = false;
            return;
        }
        jt0Var.f45914t1.b(1);
        jt0Var.n((qg.m) qg.m.f44984a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        jt0 jt0Var = this.f45739b;
        if (jt0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            jt0Var.r0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        jt0 jt0Var = this.f45739b;
        jt0Var.F0.f45105a.e();
        jt0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        jt0 jt0Var = this.f45739b;
        if (jt0Var.S0 != null) {
            jt0Var.r0(null, true);
        }
        jt0Var.l1.setViewHidden(true);
    }
}
