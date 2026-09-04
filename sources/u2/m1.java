package u2;
public final class m1 implements b1 {
    public final b1 f46751a;
    public final long f46752b;

    public m1(b1 b1Var, long j3) {
        this.f46751a = b1Var;
        this.f46752b = j3;
    }

    @Override
    public final void b() {
        this.f46751a.b();
    }

    @Override
    public final boolean e() {
        return this.f46751a.e();
    }

    @Override
    public final int f(n4.y yVar, h2.g gVar, int i10) {
        int f7 = this.f46751a.f(yVar, gVar, i10);
        if (f7 == -4) {
            gVar.h += this.f46752b;
        }
        return f7;
    }

    @Override
    public final int m(long j3) {
        return this.f46751a.m(j3 - this.f46752b);
    }
}
