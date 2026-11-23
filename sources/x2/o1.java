package x2;
public final class o1 implements d1 {
    public final d1 f60232a;
    public final long f60233b;

    public o1(d1 d1Var, long j3) {
        this.f60232a = d1Var;
        this.f60233b = j3;
    }

    @Override
    public final void a() {
        this.f60232a.a();
    }

    @Override
    public final boolean h() {
        return this.f60232a.h();
    }

    @Override
    public final int j(long j3) {
        return this.f60232a.j(j3 - this.f60233b);
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        int m10 = this.f60232a.m(aVar, hVar, i7);
        if (m10 == -4) {
            hVar.f18159e += this.f60233b;
        }
        return m10;
    }
}
