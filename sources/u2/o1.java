package u2;
public final class o1 implements d1 {
    public final d1 f47419a;
    public final long f47420b;

    public o1(d1 d1Var, long j10) {
        this.f47419a = d1Var;
        this.f47420b = j10;
    }

    @Override
    public final void a() {
        this.f47419a.a();
    }

    @Override
    public final boolean e() {
        return this.f47419a.e();
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        int f7 = this.f47419a.f(bVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.f47420b;
        }
        return f7;
    }

    @Override
    public final int h(long j10) {
        return this.f47419a.h(j10 - this.f47420b);
    }
}
