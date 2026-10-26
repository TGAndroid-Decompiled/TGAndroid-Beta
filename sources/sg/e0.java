package sg;

import org.telegram.ui.nt0;
import org.telegram.ui.xq0;
public final class e0 implements rg.b1 {
    public final xq0 f48192a;
    public final nt0 f48193b;

    public e0(nt0 nt0Var, xq0 xq0Var) {
        this.f48193b = nt0Var;
        this.f48192a = xq0Var;
    }

    @Override
    public final void a() {
        this.f48192a.run();
    }

    @Override
    public final void b() {
        f0 f0Var = this.f48193b.M0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        nt0 nt0Var = this.f48193b;
        if (nt0Var.Z0) {
            nt0Var.Z0 = false;
            return;
        }
        nt0Var.f48342i1.b(1);
        nt0Var.i((rg.m) rg.m.f47465a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        nt0 nt0Var = this.f48193b;
        if (nt0Var.H0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            nt0Var.q0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        nt0 nt0Var = this.f48193b;
        nt0Var.f48358u0.f47562a.a();
        nt0Var.f48332a1.setViewHidden(false);
    }

    @Override
    public final void f() {
        nt0 nt0Var = this.f48193b;
        if (nt0Var.H0 != null) {
            nt0Var.q0(null, true);
        }
        nt0Var.f48332a1.setViewHidden(true);
    }
}
