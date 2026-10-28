package sg;

import org.telegram.ui.pt0;
import org.telegram.ui.zq0;
public final class d0 implements rg.b1 {
    public final zq0 f48218a;
    public final pt0 f48219b;

    public d0(pt0 pt0Var, zq0 zq0Var) {
        this.f48219b = pt0Var;
        this.f48218a = zq0Var;
    }

    @Override
    public final void a() {
        this.f48218a.run();
    }

    @Override
    public final void b() {
        e0 e0Var = this.f48219b.M0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        pt0 pt0Var = this.f48219b;
        if (pt0Var.Z0) {
            pt0Var.Z0 = false;
            return;
        }
        pt0Var.f48368i1.b(1);
        pt0Var.i((rg.m) rg.m.f47500a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        pt0 pt0Var = this.f48219b;
        if (pt0Var.H0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            pt0Var.q0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        pt0 pt0Var = this.f48219b;
        pt0Var.f48384u0.f47597a.a();
        pt0Var.f48358a1.setViewHidden(false);
    }

    @Override
    public final void f() {
        pt0 pt0Var = this.f48219b;
        if (pt0Var.H0 != null) {
            pt0Var.q0(null, true);
        }
        pt0Var.f48358a1.setViewHidden(true);
    }
}
