package u2;
public final class m1 implements b1 {
    public final b1 f46779a;
    public final long f46780b;

    public m1(b1 b1Var, long j3) {
        this.f46779a = b1Var;
        this.f46780b = j3;
    }

    @Override
    public final void b() {
        this.f46779a.b();
    }

    @Override
    public final boolean e() {
        return this.f46779a.e();
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        int f7 = this.f46779a.f(yVar, hVar, i10);
        if (f7 == -4) {
            hVar.f10877e += this.f46780b;
        }
        return f7;
    }

    @Override
    public final int m(long j3) {
        return this.f46779a.m(j3 - this.f46780b);
    }
}
