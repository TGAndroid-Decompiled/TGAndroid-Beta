package qg;

import org.telegram.ui.dr0;
import org.telegram.ui.vt0;
public final class d0 implements pg.e1 {
    public final dr0 f44999a;
    public final vt0 f45000b;

    public d0(vt0 vt0Var, dr0 dr0Var) {
        this.f45000b = vt0Var;
        this.f44999a = dr0Var;
    }

    @Override
    public final void a() {
        this.f44999a.run();
    }

    @Override
    public final void b() {
        e0 e0Var = this.f45000b.X0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        vt0 vt0Var = this.f45000b;
        if (vt0Var.f45175k1) {
            vt0Var.f45175k1 = false;
            return;
        }
        vt0Var.f45187t1.b(1);
        vt0Var.b((pg.m) pg.m.f44527a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        vt0 vt0Var = this.f45000b;
        if (vt0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            vt0Var.s0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        vt0 vt0Var = this.f45000b;
        vt0Var.F0.f44671a.j();
        vt0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        vt0 vt0Var = this.f45000b;
        if (vt0Var.S0 != null) {
            vt0Var.s0(null, true);
        }
        vt0Var.l1.setViewHidden(true);
    }
}
