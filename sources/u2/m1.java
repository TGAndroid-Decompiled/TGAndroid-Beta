package u2;
public final class m1 implements b1 {
    public final b1 f43765a;
    public final long f43766b;

    public m1(b1 b1Var, long j3) {
        this.f43765a = b1Var;
        this.f43766b = j3;
    }

    @Override
    public final void a() {
        this.f43765a.a();
    }

    @Override
    public final boolean e() {
        return this.f43765a.e();
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        int f7 = this.f43765a.f(yVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.f43766b;
        }
        return f7;
    }

    @Override
    public final int h(long j3) {
        return this.f43765a.h(j3 - this.f43766b);
    }
}
