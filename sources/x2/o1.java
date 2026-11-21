package x2;
public final class o1 implements d1 {
    public final d1 f60228a;
    public final long f60229b;

    public o1(d1 d1Var, long j3) {
        this.f60228a = d1Var;
        this.f60229b = j3;
    }

    @Override
    public final void a() {
        this.f60228a.a();
    }

    @Override
    public final boolean h() {
        return this.f60228a.h();
    }

    @Override
    public final int j(long j3) {
        return this.f60228a.j(j3 - this.f60229b);
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        int m10 = this.f60228a.m(aVar, hVar, i7);
        if (m10 == -4) {
            hVar.f18156e += this.f60229b;
        }
        return m10;
    }
}
