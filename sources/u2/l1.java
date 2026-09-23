package u2;
public final class l1 implements a1 {
    public final a1 f43360a;
    public final long f43361b;

    public l1(a1 a1Var, long j3) {
        this.f43360a = a1Var;
        this.f43361b = j3;
    }

    @Override
    public final void a() {
        this.f43360a.a();
    }

    @Override
    public final boolean e() {
        return this.f43360a.e();
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        int f7 = this.f43360a.f(yVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.f43361b;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        return this.f43360a.j(j3 - this.f43361b);
    }
}
