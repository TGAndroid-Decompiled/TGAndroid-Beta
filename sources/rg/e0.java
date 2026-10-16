package rg;

import org.telegram.ui.gu0;
import org.telegram.ui.mr0;
public final class e0 implements qg.b1 {
    public final mr0 f44000a;
    public final gu0 f44001b;

    public e0(gu0 gu0Var, mr0 mr0Var) {
        this.f44001b = gu0Var;
        this.f44000a = mr0Var;
    }

    @Override
    public final void a() {
        this.f44000a.run();
    }

    @Override
    public final void b() {
        f0 f0Var = this.f44001b.X0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        gu0 gu0Var = this.f44001b;
        if (gu0Var.f44178k1) {
            gu0Var.f44178k1 = false;
            return;
        }
        gu0Var.f44190t1.b(1);
        gu0Var.o((qg.m) qg.m.f43227a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        gu0 gu0Var = this.f44001b;
        if (gu0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            gu0Var.s0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        gu0 gu0Var = this.f44001b;
        gu0Var.F0.f43327a.e();
        gu0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        gu0 gu0Var = this.f44001b;
        if (gu0Var.S0 != null) {
            gu0Var.s0(null, true);
        }
        gu0Var.l1.setViewHidden(true);
    }
}
