package p4;
public final class z implements c0, l0 {
    public final boolean f55460a;
    public final boolean f55461b;
    public final Object f55462c;
    public final Object d;

    public z(m0 m0Var, e2.l0 l0Var, boolean z10, boolean z11) {
        this.f55462c = m0Var;
        this.d = l0Var;
        this.f55460a = z10;
        this.f55461b = z11;
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.b(i7, (n1) this.f55462c, this.f55460a, this.f55461b, ((v) this.d).f55444c);
    }

    @Override
    public void f(v vVar) {
        m0 m0Var = (m0) this.f55462c;
        m9.e0 q10 = m0Var.h.q(vVar, h9.i0.u((e2.l0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = m0Var;
        obj.f20023c = vVar;
        obj.f20021a = this.f55460a;
        obj.f20022b = this.f55461b;
        q10.b(new m9.u(0, q10, (Object) obj), m9.r.f20952a);
    }

    public z(n1 n1Var, boolean z10, boolean z11, v vVar) {
        this.f55462c = n1Var;
        this.f55460a = z10;
        this.f55461b = z11;
        this.d = vVar;
    }
}
