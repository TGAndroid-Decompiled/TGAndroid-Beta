package u2;
public final class l1 implements a1 {
    public final a1 f48717a;
    public final long f48718b;

    public l1(a1 a1Var, long j3) {
        this.f48717a = a1Var;
        this.f48718b = j3;
    }

    @Override
    public final void a() {
        this.f48717a.a();
    }

    @Override
    public final boolean e() {
        return this.f48717a.e();
    }

    @Override
    public final int f(n4.x xVar, h2.h hVar, int i10) {
        int f7 = this.f48717a.f(xVar, hVar, i10);
        if (f7 == -4) {
            hVar.f10985e += this.f48718b;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        return this.f48717a.j(j3 - this.f48718b);
    }
}
