package rg;

import org.telegram.ui.gt0;
import org.telegram.ui.qq0;
public final class c0 implements qg.e1 {
    public final qq0 f45298a;
    public final gt0 f45299b;

    public c0(gt0 gt0Var, qq0 qq0Var) {
        this.f45299b = gt0Var;
        this.f45298a = qq0Var;
    }

    @Override
    public final void a() {
        this.f45298a.run();
    }

    @Override
    public final void b() {
        d0 d0Var = this.f45299b.X0;
        if (d0Var != null) {
            d0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        gt0 gt0Var = this.f45299b;
        if (gt0Var.f45484k1) {
            gt0Var.f45484k1 = false;
            return;
        }
        gt0Var.f45496t1.b(1);
        gt0Var.o((qg.m) qg.m.f44553a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        gt0 gt0Var = this.f45299b;
        if (gt0Var.S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            gt0Var.s0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        gt0 gt0Var = this.f45299b;
        gt0Var.F0.f44687a.e();
        gt0Var.l1.setViewHidden(false);
    }

    @Override
    public final void f() {
        gt0 gt0Var = this.f45299b;
        if (gt0Var.S0 != null) {
            gt0Var.s0(null, true);
        }
        gt0Var.l1.setViewHidden(true);
    }
}
