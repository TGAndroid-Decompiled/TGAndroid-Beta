package u2;
public abstract class o1 extends l {
    public final a f48780k;

    public o1(a aVar) {
        this.f48780k = aVar;
    }

    public abstract void A(b2.k1 k1Var);

    public final void B() {
        y(null, this.f48780k);
    }

    public void C() {
        B();
    }

    @Override
    public boolean a(b2.k0 k0Var) {
        return this.f48780k.a(k0Var);
    }

    @Override
    public b2.k1 h() {
        return this.f48780k.h();
    }

    @Override
    public final b2.k0 i() {
        return this.f48780k.i();
    }

    @Override
    public boolean j() {
        return this.f48780k.j();
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f48742j = c0Var;
        this.f48741i = e2.d0.o(null);
        C();
    }

    @Override
    public void t(b2.k0 k0Var) {
        this.f48780k.t(k0Var);
    }

    @Override
    public final f0 u(Object obj, f0 f0Var) {
        Void r12 = (Void) obj;
        return z(f0Var);
    }

    @Override
    public final long v(Object obj, long j3) {
        Void r12 = (Void) obj;
        return j3;
    }

    @Override
    public final int w(int i10, Object obj) {
        Void r22 = (Void) obj;
        return i10;
    }

    @Override
    public final void x(Object obj, a aVar, b2.k1 k1Var) {
        Void r12 = (Void) obj;
        A(k1Var);
    }

    public f0 z(f0 f0Var) {
        return f0Var;
    }
}
