package p4;
public final class z implements c0, m0 {
    public final boolean f55585a;
    public final boolean f55586b;
    public final Object f55587c;
    public final Object d;

    public z(n0 n0Var, e2.l0 l0Var, boolean z10, boolean z11) {
        this.f55587c = n0Var;
        this.d = l0Var;
        this.f55585a = z10;
        this.f55586b = z11;
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.b(i7, (m1) this.f55587c, this.f55585a, this.f55586b, ((v) this.d).f55569c);
    }

    @Override
    public void f(v vVar) {
        n0 n0Var = (n0) this.f55587c;
        m9.e0 q10 = n0Var.h.q(vVar, h9.i0.u((e2.l0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = n0Var;
        obj.f20117c = vVar;
        obj.f20115a = this.f55585a;
        obj.f20116b = this.f55586b;
        q10.b(new m9.u(0, q10, (Object) obj), m9.r.f21045a);
    }

    public z(m1 m1Var, boolean z10, boolean z11, v vVar) {
        this.f55587c = m1Var;
        this.f55585a = z10;
        this.f55586b = z11;
        this.d = vVar;
    }
}
