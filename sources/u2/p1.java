package u2;
public final class p1 implements e1 {
    public final e1 f47415a;
    public final long f47416b;

    public p1(e1 e1Var, long j10) {
        this.f47415a = e1Var;
        this.f47416b = j10;
    }

    @Override
    public final void a() {
        this.f47415a.a();
    }

    @Override
    public final boolean f() {
        return this.f47415a.f();
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        int g10 = this.f47415a.g(bVar, hVar, i10);
        if (g10 == -4) {
            hVar.e += this.f47416b;
        }
        return g10;
    }

    @Override
    public final int m(long j10) {
        return this.f47415a.m(j10 - this.f47416b);
    }
}
