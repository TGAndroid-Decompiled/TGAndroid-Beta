package u2;
public final class m1 implements b1 {
    public final b1 f46752a;
    public final long f46753b;

    public m1(b1 b1Var, long j3) {
        this.f46752a = b1Var;
        this.f46753b = j3;
    }

    @Override
    public final void b() {
        this.f46752a.b();
    }

    @Override
    public final boolean e() {
        return this.f46752a.e();
    }

    @Override
    public final int f(n4.y yVar, h2.g gVar, int i10) {
        int f7 = this.f46752a.f(yVar, gVar, i10);
        if (f7 == -4) {
            gVar.h += this.f46753b;
        }
        return f7;
    }

    @Override
    public final int m(long j3) {
        return this.f46752a.m(j3 - this.f46753b);
    }
}
