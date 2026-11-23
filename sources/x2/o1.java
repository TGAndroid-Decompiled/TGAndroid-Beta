package x2;
public final class o1 implements d1 {
    public final d1 f60315a;
    public final long f60316b;

    public o1(d1 d1Var, long j3) {
        this.f60315a = d1Var;
        this.f60316b = j3;
    }

    @Override
    public final void a() {
        this.f60315a.a();
    }

    @Override
    public final int b(jb.m mVar, k2.h hVar, int i7) {
        int b10 = this.f60315a.b(mVar, hVar, i7);
        if (b10 == -4) {
            hVar.f18224e += this.f60316b;
        }
        return b10;
    }

    @Override
    public final boolean h() {
        return this.f60315a.h();
    }

    @Override
    public final int o(long j3) {
        return this.f60315a.o(j3 - this.f60316b);
    }
}
