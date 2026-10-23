package u2;
public final class q1 implements f1 {
    public final f1 f47870a;
    public final long f47871b;

    public q1(f1 f1Var, long j10) {
        this.f47870a = f1Var;
        this.f47871b = j10;
    }

    @Override
    public final void a() {
        this.f47870a.a();
    }

    @Override
    public final boolean f() {
        return this.f47870a.f();
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        int g10 = this.f47870a.g(bVar, hVar, i10);
        if (g10 == -4) {
            hVar.e += this.f47871b;
        }
        return g10;
    }

    @Override
    public final int m(long j10) {
        return this.f47870a.m(j10 - this.f47871b);
    }
}
