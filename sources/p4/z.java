package p4;
public final class z implements c0, l0 {
    public final boolean f55470a;
    public final boolean f55471b;
    public final Object f55472c;
    public final Object d;

    public z(m0 m0Var, e2.l0 l0Var, boolean z10, boolean z11) {
        this.f55472c = m0Var;
        this.d = l0Var;
        this.f55470a = z10;
        this.f55471b = z11;
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.b(i7, (n1) this.f55472c, this.f55470a, this.f55471b, ((v) this.d).f55454c);
    }

    @Override
    public void f(v vVar) {
        m0 m0Var = (m0) this.f55472c;
        m9.e0 q10 = m0Var.h.q(vVar, h9.i0.u((e2.l0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = m0Var;
        obj.f20020c = vVar;
        obj.f20018a = this.f55470a;
        obj.f20019b = this.f55471b;
        q10.b(new m9.u(0, q10, (Object) obj), m9.r.f20949a);
    }

    public z(n1 n1Var, boolean z10, boolean z11, v vVar) {
        this.f55472c = n1Var;
        this.f55470a = z10;
        this.f55471b = z11;
        this.d = vVar;
    }
}
