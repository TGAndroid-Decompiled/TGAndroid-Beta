package qg;

import org.telegram.ui.cu0;
import org.telegram.ui.kr0;
public final class d0 implements pg.c1 {
    public final kr0 f46155a;
    public final cu0 f46156b;

    public d0(cu0 cu0Var, kr0 kr0Var) {
        this.f46156b = cu0Var;
        this.f46155a = kr0Var;
    }

    @Override
    public final void a() {
        this.f46155a.run();
    }

    @Override
    public final void b() {
        e0 e0Var = this.f46156b.X0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        cu0 cu0Var = this.f46156b;
        if (cu0Var.f46316k1) {
            cu0Var.f46316k1 = false;
            return;
        }
        cu0Var.f46328t1.b(1);
        cu0Var.b((pg.m) pg.m.f45582a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        cu0 cu0Var = this.f46156b;
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
        cu0 cu0Var = this.f46156b;
        cu0Var.F0.f45695a.e();
        cu0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        cu0 cu0Var = this.f46156b;
        if (cu0Var.S0 != null) {
            cu0Var.s0(null, true);
        }
        cu0Var.l1.setViewHidden(true);
    }
}
