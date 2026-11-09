package p4;
public final class z implements c0, l0 {
    public final boolean f53481a;
    public final boolean f53482b;
    public final Object f53483c;
    public final Object d;

    public z(m0 m0Var, e2.l0 l0Var, boolean z9, boolean z10) {
        this.f53483c = m0Var;
        this.d = l0Var;
        this.f53481a = z9;
        this.f53482b = z10;
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.b(i7, (l1) this.f53483c, this.f53481a, this.f53482b, ((v) this.d).f53465c);
    }

    @Override
    public void f(v vVar) {
        m0 m0Var = (m0) this.f53483c;
        m9.e0 q10 = m0Var.h.q(vVar, h9.i0.u((e2.l0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = m0Var;
        obj.f19077c = vVar;
        obj.f19075a = this.f53481a;
        obj.f19076b = this.f53482b;
        q10.b(new m9.u(0, q10, (Object) obj), m9.r.f19994a);
    }

    public z(l1 l1Var, boolean z9, boolean z10, v vVar) {
        this.f53483c = l1Var;
        this.f53481a = z9;
        this.f53482b = z10;
        this.d = vVar;
    }
}
