package u2;
public final class p1 implements e1 {
    public final e1 f47402a;
    public final long f47403b;

    public p1(e1 e1Var, long j10) {
        this.f47402a = e1Var;
        this.f47403b = j10;
    }

    @Override
    public final void a() {
        this.f47402a.a();
    }

    @Override
    public final boolean e() {
        return this.f47402a.e();
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        int f7 = this.f47402a.f(bVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.f47403b;
        }
        return f7;
    }

    @Override
    public final int h(long j10) {
        return this.f47402a.h(j10 - this.f47403b);
    }
}
