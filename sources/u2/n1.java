package u2;
public final class n1 implements c1 {
    public final c1 f47359a;
    public final long f47360b;

    public n1(c1 c1Var, long j3) {
        this.f47359a = c1Var;
        this.f47360b = j3;
    }

    @Override
    public final void a() {
        this.f47359a.a();
    }

    @Override
    public final boolean e() {
        return this.f47359a.e();
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        int f7 = this.f47359a.f(yVar, hVar, i10);
        if (f7 == -4) {
            hVar.f10981e += this.f47360b;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        return this.f47359a.j(j3 - this.f47360b);
    }
}
