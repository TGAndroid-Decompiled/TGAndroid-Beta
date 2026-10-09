package u2;
public final class m1 implements b1 {
    public final b1 f48652a;
    public final long f48653b;

    public m1(b1 b1Var, long j3) {
        this.f48652a = b1Var;
        this.f48653b = j3;
    }

    @Override
    public final void a() {
        this.f48652a.a();
    }

    @Override
    public final boolean e() {
        return this.f48652a.e();
    }

    @Override
    public final int f(n4.x xVar, h2.h hVar, int i10) {
        int f7 = this.f48652a.f(xVar, hVar, i10);
        if (f7 == -4) {
            hVar.f10986e += this.f48653b;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        return this.f48652a.j(j3 - this.f48653b);
    }
}
