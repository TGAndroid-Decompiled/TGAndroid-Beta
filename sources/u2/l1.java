package u2;
public final class l1 implements a1 {
    public final a1 f48866a;
    public final long f48867b;

    public l1(a1 a1Var, long j3) {
        this.f48866a = a1Var;
        this.f48867b = j3;
    }

    @Override
    public final void a() {
        this.f48866a.a();
    }

    @Override
    public final boolean e() {
        return this.f48866a.e();
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        int f7 = this.f48866a.f(yVar, hVar, i10);
        if (f7 == -4) {
            hVar.f10984e += this.f48867b;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        return this.f48866a.j(j3 - this.f48867b);
    }
}
