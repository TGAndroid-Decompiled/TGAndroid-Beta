package ph;
public final class t4 implements cg.o1 {
    public final h9 f42396a;

    public t4(h9 h9Var) {
        this.f42396a = h9Var;
    }

    @Override
    public final void b() {
        u4 u4Var = this.f42396a.M0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
    }

    @Override
    public final void c() {
        h9 h9Var = this.f42396a;
        if (h9Var.Z0) {
            h9Var.Z0 = false;
            return;
        }
        h9Var.f41379h1.b(1);
        h9Var.x((cg.m) cg.m.f2430a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z4;
        h9 h9Var = this.f42396a;
        if (h9Var.G0 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            h9Var.D0(null, true);
        }
        return z4;
    }

    @Override
    public final void e() {
        h9 h9Var = this.f42396a;
        h9Var.A0.f2411a.g();
        h9Var.f41366a1.setViewHidden(false);
    }

    @Override
    public final void f() {
        h9 h9Var = this.f42396a;
        if (h9Var.G0 != null) {
            h9Var.D0(null, true);
        }
        h9Var.f41366a1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
