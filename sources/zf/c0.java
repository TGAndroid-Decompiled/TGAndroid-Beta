package zf;

import org.telegram.ui.hq0;
import org.telegram.ui.ys0;

public final class c0 implements yf.a1 {

    public final hq0 f50357a;

    public final ys0 f50358b;

    public c0(ys0 ys0Var, hq0 hq0Var) {
        this.f50358b = ys0Var;
        this.f50357a = hq0Var;
    }

    @Override
    public final void a() {
        this.f50357a.run();
    }

    @Override
    public final void b() {
        d0 d0Var = this.f50358b.T0;
        if (d0Var != null) {
            d0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        ys0 ys0Var = this.f50358b;
        if (ys0Var.f50516g1) {
            ys0Var.f50516g1 = false;
        } else {
            ys0Var.f50528p1.b(1);
            ys0Var.l((yf.m) yf.m.f49979a.get(0));
        }
    }

    @Override
    public final boolean d() {
        ys0 ys0Var = this.f50358b;
        boolean z10 = ys0Var.O0 == null;
        if (!z10) {
            ys0Var.r0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        ys0 ys0Var = this.f50358b;
        ys0Var.B0.f50076a.g();
        ys0Var.f50518h1.setViewHidden(false);
    }

    @Override
    public final void f() {
        ys0 ys0Var = this.f50358b;
        if (ys0Var.O0 != null) {
            ys0Var.r0(null, true);
        }
        ys0Var.f50518h1.setViewHidden(true);
    }
}
