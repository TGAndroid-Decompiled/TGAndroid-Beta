package u2;
public final class m1 implements b1 {
    public final b1 f43691a;
    public final long f43692b;

    public m1(b1 b1Var, long j3) {
        this.f43691a = b1Var;
        this.f43692b = j3;
    }

    @Override
    public final void a() {
        this.f43691a.a();
    }

    @Override
    public final boolean e() {
        return this.f43691a.e();
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        int f7 = this.f43691a.f(yVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.f43692b;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        return this.f43691a.j(j3 - this.f43692b);
    }
}
