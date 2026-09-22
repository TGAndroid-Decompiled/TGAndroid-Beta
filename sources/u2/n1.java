package u2;
public final class n1 implements c1 {
    public final c1 f43761a;
    public final long f43762b;

    public n1(c1 c1Var, long j3) {
        this.f43761a = c1Var;
        this.f43762b = j3;
    }

    @Override
    public final void a() {
        this.f43761a.a();
    }

    @Override
    public final boolean e() {
        return this.f43761a.e();
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        int f7 = this.f43761a.f(yVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.f43762b;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        return this.f43761a.j(j3 - this.f43762b);
    }
}
