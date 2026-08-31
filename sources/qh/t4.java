package qh;
public final class t4 implements dg.n1 {
    public final f9 f46117a;

    public t4(f9 f9Var) {
        this.f46117a = f9Var;
    }

    @Override
    public final void b() {
        u4 u4Var = this.f46117a.M0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
    }

    @Override
    public final void c() {
        f9 f9Var = this.f46117a;
        if (f9Var.Z0) {
            f9Var.Z0 = false;
            return;
        }
        f9Var.f44958h1.b(1);
        f9Var.g((dg.m) dg.m.f4581a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z4;
        f9 f9Var = this.f46117a;
        if (f9Var.G0 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            f9Var.D0(null, true);
        }
        return z4;
    }

    @Override
    public final void e() {
        f9 f9Var = this.f46117a;
        f9Var.A0.f4556a.e();
        f9Var.f44945a1.setViewHidden(false);
    }

    @Override
    public final void f() {
        f9 f9Var = this.f46117a;
        if (f9Var.G0 != null) {
            f9Var.D0(null, true);
        }
        f9Var.f44945a1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
