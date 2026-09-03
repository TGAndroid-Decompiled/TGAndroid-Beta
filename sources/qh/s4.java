package qh;
public final class s4 implements dg.n1 {
    public final e9 f46097a;

    public s4(e9 e9Var) {
        this.f46097a = e9Var;
    }

    @Override
    public final void b() {
        t4 t4Var = this.f46097a.M0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
    }

    @Override
    public final void c() {
        e9 e9Var = this.f46097a;
        if (e9Var.Z0) {
            e9Var.Z0 = false;
            return;
        }
        e9Var.f44935h1.b(1);
        e9Var.g((dg.m) dg.m.f4581a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z4;
        e9 e9Var = this.f46097a;
        if (e9Var.G0 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            e9Var.D0(null, true);
        }
        return z4;
    }

    @Override
    public final void e() {
        e9 e9Var = this.f46097a;
        e9Var.A0.f4556a.e();
        e9Var.f44922a1.setViewHidden(false);
    }

    @Override
    public final void f() {
        e9 e9Var = this.f46097a;
        if (e9Var.G0 != null) {
            e9Var.D0(null, true);
        }
        e9Var.f44922a1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
