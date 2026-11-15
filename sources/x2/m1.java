package x2;
public final class m1 implements b1 {
    public final b1 f59605a;
    public final long f59606b;

    public m1(b1 b1Var, long j3) {
        this.f59605a = b1Var;
        this.f59606b = j3;
    }

    @Override
    public final void a() {
        this.f59605a.a();
    }

    @Override
    public final boolean f() {
        return this.f59605a.f();
    }

    @Override
    public final int n(long j3) {
        return this.f59605a.n(j3 - this.f59606b);
    }

    @Override
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        int q10 = this.f59605a.q(aVar, hVar, i7);
        if (q10 == -4) {
            hVar.f17733e += this.f59606b;
        }
        return q10;
    }
}
