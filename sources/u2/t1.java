package u2;
public abstract class t1 extends l {
    public final a f49469k;

    public t1(a aVar) {
        this.f49469k = aVar;
    }

    public abstract void A(b2.p1 p1Var);

    public final void B() {
        y(null, this.f49469k);
    }

    public void C() {
        B();
    }

    @Override
    public boolean a(b2.p0 p0Var) {
        return this.f49469k.a(p0Var);
    }

    @Override
    public b2.p1 h() {
        return this.f49469k.h();
    }

    @Override
    public final b2.p0 i() {
        return this.f49469k.i();
    }

    @Override
    public boolean j() {
        return this.f49469k.j();
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f49378j = c0Var;
        this.f49377i = e2.n0.q(null);
        C();
    }

    @Override
    public void t(b2.p0 p0Var) {
        this.f49469k.t(p0Var);
    }

    @Override
    public final g0 u(Object obj, g0 g0Var) {
        Void r12 = (Void) obj;
        return z(g0Var);
    }

    @Override
    public final long v(Object obj, long j10) {
        Void r12 = (Void) obj;
        return j10;
    }

    @Override
    public final int w(int i10, Object obj) {
        Void r22 = (Void) obj;
        return i10;
    }

    @Override
    public final void x(Object obj, a aVar, b2.p1 p1Var) {
        Void r12 = (Void) obj;
        A(p1Var);
    }

    public g0 z(g0 g0Var) {
        return g0Var;
    }
}
