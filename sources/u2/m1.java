package u2;
public final class m1 implements b1 {
    public final b1 f48698a;
    public final long f48699b;

    public m1(b1 b1Var, long j3) {
        this.f48698a = b1Var;
        this.f48699b = j3;
    }

    @Override
    public final void a() {
        this.f48698a.a();
    }

    @Override
    public final boolean e() {
        return this.f48698a.e();
    }

    @Override
    public final int f(n4.x xVar, h2.h hVar, int i10) {
        int f7 = this.f48698a.f(xVar, hVar, i10);
        if (f7 == -4) {
            hVar.f10986e += this.f48699b;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        return this.f48698a.j(j3 - this.f48699b);
    }
}
