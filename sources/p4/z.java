package p4;
public final class z implements c0, l0 {
    public final boolean f53351a;
    public final boolean f53352b;
    public final Object f53353c;
    public final Object d;

    public z(m0 m0Var, e2.l0 l0Var, boolean z9, boolean z10) {
        this.f53353c = m0Var;
        this.d = l0Var;
        this.f53351a = z9;
        this.f53352b = z10;
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.b(i7, (l1) this.f53353c, this.f53351a, this.f53352b, ((v) this.d).f53335c);
    }

    @Override
    public void f(v vVar) {
        m0 m0Var = (m0) this.f53353c;
        m9.e0 q10 = m0Var.h.q(vVar, h9.i0.u((e2.l0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = m0Var;
        obj.f19074c = vVar;
        obj.f19072a = this.f53351a;
        obj.f19073b = this.f53352b;
        q10.b(new m9.u(0, q10, (Object) obj), m9.r.f19991a);
    }

    public z(l1 l1Var, boolean z9, boolean z10, v vVar) {
        this.f53353c = l1Var;
        this.f53351a = z9;
        this.f53352b = z10;
        this.d = vVar;
    }
}
