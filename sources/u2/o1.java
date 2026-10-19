package u2;
public final class o1 implements d1 {
    public final d1 f47396a;
    public final long f47397b;

    public o1(d1 d1Var, long j10) {
        this.f47396a = d1Var;
        this.f47397b = j10;
    }

    @Override
    public final void a() {
        this.f47396a.a();
    }

    @Override
    public final boolean f() {
        return this.f47396a.f();
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        int g10 = this.f47396a.g(bVar, hVar, i10);
        if (g10 == -4) {
            hVar.e += this.f47397b;
        }
        return g10;
    }

    @Override
    public final int m(long j10) {
        return this.f47396a.m(j10 - this.f47397b);
    }
}
