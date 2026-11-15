package p4;
public final class z implements c0, l0 {
    public final boolean f54886a;
    public final boolean f54887b;
    public final Object f54888c;
    public final Object d;

    public z(m0 m0Var, e2.l0 l0Var, boolean z10, boolean z11) {
        this.f54888c = m0Var;
        this.d = l0Var;
        this.f54886a = z10;
        this.f54887b = z11;
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.b(i7, (l1) this.f54888c, this.f54886a, this.f54887b, ((v) this.d).f54870c);
    }

    @Override
    public void f(v vVar) {
        m0 m0Var = (m0) this.f54888c;
        m9.e0 q10 = m0Var.h.q(vVar, h9.i0.u((e2.l0) this.d), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.d = m0Var;
        obj.f19659c = vVar;
        obj.f19657a = this.f54886a;
        obj.f19658b = this.f54887b;
        q10.b(new m9.u(0, q10, (Object) obj), m9.r.f20591a);
    }

    public z(l1 l1Var, boolean z10, boolean z11, v vVar) {
        this.f54888c = l1Var;
        this.f54886a = z10;
        this.f54887b = z11;
        this.d = vVar;
    }
}
