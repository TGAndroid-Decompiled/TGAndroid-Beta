package u2;
public final class o1 implements d1 {
    public final d1 f42411a;
    public final long f42412b;

    public o1(d1 d1Var, long j3) {
        this.f42411a = d1Var;
        this.f42412b = j3;
    }

    @Override
    public final void a() {
        this.f42411a.a();
    }

    @Override
    public final boolean e() {
        return this.f42411a.e();
    }

    @Override
    public final int g(long j3) {
        return this.f42411a.g(j3 - this.f42412b);
    }

    @Override
    public final int t(of.b bVar, h2.h hVar, int i10) {
        int t10 = this.f42411a.t(bVar, hVar, i10);
        if (t10 == -4) {
            hVar.e += this.f42412b;
        }
        return t10;
    }
}
