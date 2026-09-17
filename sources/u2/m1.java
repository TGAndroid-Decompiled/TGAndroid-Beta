package u2;
public final class m1 implements b1 {
    public final b1 f46780a;
    public final long f46781b;

    public m1(b1 b1Var, long j3) {
        this.f46780a = b1Var;
        this.f46781b = j3;
    }

    @Override
    public final void b() {
        this.f46780a.b();
    }

    @Override
    public final boolean e() {
        return this.f46780a.e();
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        int f7 = this.f46780a.f(yVar, hVar, i10);
        if (f7 == -4) {
            hVar.f10877e += this.f46781b;
        }
        return f7;
    }

    @Override
    public final int m(long j3) {
        return this.f46780a.m(j3 - this.f46781b);
    }
}
