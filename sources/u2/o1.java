package u2;
public final class o1 implements d1 {
    public final d1 f49392a;
    public final long f49393b;

    public o1(d1 d1Var, long j10) {
        this.f49392a = d1Var;
        this.f49393b = j10;
    }

    @Override
    public final void d() {
        this.f49392a.d();
    }

    @Override
    public final boolean e() {
        return this.f49392a.e();
    }

    @Override
    public final int f(n4.s sVar, h2.h hVar, int i10) {
        int f7 = this.f49392a.f(sVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.f49393b;
        }
        return f7;
    }

    @Override
    public final int j(long j10) {
        return this.f49392a.j(j10 - this.f49393b);
    }
}
