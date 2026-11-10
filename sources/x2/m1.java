package x2;
public final class m1 implements b1 {
    public final b1 f58424a;
    public final long f58425b;

    public m1(b1 b1Var, long j3) {
        this.f58424a = b1Var;
        this.f58425b = j3;
    }

    @Override
    public final void a() {
        this.f58424a.a();
    }

    @Override
    public final boolean f() {
        return this.f58424a.f();
    }

    @Override
    public final int l(long j3) {
        return this.f58424a.l(j3 - this.f58425b);
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        int m10 = this.f58424a.m(bVar, hVar, i7);
        if (m10 == -4) {
            hVar.f17176e += this.f58425b;
        }
        return m10;
    }
}
