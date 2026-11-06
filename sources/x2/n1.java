package x2;
public final class n1 implements c1 {
    public final c1 f58319a;
    public final long f58320b;

    public n1(c1 c1Var, long j3) {
        this.f58319a = c1Var;
        this.f58320b = j3;
    }

    @Override
    public final void a() {
        this.f58319a.a();
    }

    @Override
    public final boolean f() {
        return this.f58319a.f();
    }

    @Override
    public final int l(long j3) {
        return this.f58319a.l(j3 - this.f58320b);
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        int m10 = this.f58319a.m(bVar, hVar, i7);
        if (m10 == -4) {
            hVar.f17173e += this.f58320b;
        }
        return m10;
    }
}
