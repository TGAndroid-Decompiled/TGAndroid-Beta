package x2;
public final class o1 implements d1 {
    public final d1 f60187a;
    public final long f60188b;

    public o1(d1 d1Var, long j3) {
        this.f60187a = d1Var;
        this.f60188b = j3;
    }

    @Override
    public final void a() {
        this.f60187a.a();
    }

    @Override
    public final boolean h() {
        return this.f60187a.h();
    }

    @Override
    public final int j(long j3) {
        return this.f60187a.j(j3 - this.f60188b);
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        int m10 = this.f60187a.m(aVar, hVar, i7);
        if (m10 == -4) {
            hVar.f18125e += this.f60188b;
        }
        return m10;
    }
}
