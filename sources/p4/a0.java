package p4;
public final class a0 implements d0, m0 {
    public final boolean f55190a;
    public final boolean f55191b;
    public final Object f55192c;
    public final Object d;

    public a0(n0 n0Var, e2.l0 l0Var, boolean z10, boolean z11) {
        this.f55192c = n0Var;
        this.d = l0Var;
        this.f55190a = z10;
        this.f55191b = z11;
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.b(i7, (n1) this.f55192c, this.f55190a, this.f55191b, ((v) this.d).f55485c);
    }

    @Override
    public void f(v vVar) {
        n0 n0Var = (n0) this.f55192c;
        m9.e0 q10 = n0Var.h.q(vVar, h9.i0.u((e2.l0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = n0Var;
        obj.f20051c = vVar;
        obj.f20049a = this.f55190a;
        obj.f20050b = this.f55191b;
        q10.b(new m9.u(0, q10, (Object) obj), m9.r.f20980a);
    }

    public a0(n1 n1Var, boolean z10, boolean z11, v vVar) {
        this.f55192c = n1Var;
        this.f55190a = z10;
        this.f55191b = z11;
        this.d = vVar;
    }
}
