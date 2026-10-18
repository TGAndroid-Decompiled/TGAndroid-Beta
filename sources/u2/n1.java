package u2;
public final class n1 implements c1 {
    public final c1 f47439a;
    public final long f47440b;

    public n1(c1 c1Var, long j10) {
        this.f47439a = c1Var;
        this.f47440b = j10;
    }

    @Override
    public final void a() {
        this.f47439a.a();
    }

    @Override
    public final boolean e() {
        return this.f47439a.e();
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        int f7 = this.f47439a.f(bVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.f47440b;
        }
        return f7;
    }

    @Override
    public final int h(long j10) {
        return this.f47439a.h(j10 - this.f47440b);
    }
}
