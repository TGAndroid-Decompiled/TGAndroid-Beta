package u2;
public final class o1 implements d1 {
    public final d1 f46012a;
    public final long f46013b;

    public o1(d1 d1Var, long j10) {
        this.f46012a = d1Var;
        this.f46013b = j10;
    }

    @Override
    public final void d() {
        this.f46012a.d();
    }

    @Override
    public final boolean e() {
        return this.f46012a.e();
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        int f7 = this.f46012a.f(bVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.f46013b;
        }
        return f7;
    }

    @Override
    public final int m(long j10) {
        return this.f46012a.m(j10 - this.f46013b);
    }
}
