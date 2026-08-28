package yf;

import org.telegram.ui.gq0;
import org.telegram.ui.xs0;
public final class c0 implements xf.b1 {
    public final gq0 f49772a;
    public final xs0 f49773b;

    public c0(xs0 xs0Var, gq0 gq0Var) {
        this.f49773b = xs0Var;
        this.f49772a = gq0Var;
    }

    @Override
    public final void a() {
        this.f49772a.run();
    }

    @Override
    public final void b() {
        d0 d0Var = this.f49773b.T0;
        if (d0Var != null) {
            d0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        xs0 xs0Var = this.f49773b;
        if (xs0Var.f49938g1) {
            xs0Var.f49938g1 = false;
            return;
        }
        xs0Var.f49950p1.b(1);
        xs0Var.n((xf.m) xf.m.f49272a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        xs0 xs0Var = this.f49773b;
        if (xs0Var.O0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            xs0Var.r0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        xs0 xs0Var = this.f49773b;
        xs0Var.B0.f49381a.e();
        xs0Var.f49940h1.setViewHidden(false);
    }

    @Override
    public final void f() {
        xs0 xs0Var = this.f49773b;
        if (xs0Var.O0 != null) {
            xs0Var.r0(null, true);
        }
        xs0Var.f49940h1.setViewHidden(true);
    }
}
