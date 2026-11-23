package x2;
public final class k1 implements d1 {
    public int f60260a;
    public boolean f60261b;
    public final m1 f60262c;

    public k1(m1 m1Var) {
        this.f60262c = m1Var;
    }

    @Override
    public final void a() {
        m1 m1Var = this.f60262c;
        if (!m1Var.f60288w) {
            m1Var.f60286r.a();
        }
    }

    @Override
    public final int b(jb.m mVar, k2.h hVar, int i7) {
        c();
        m1 m1Var = this.f60262c;
        boolean z10 = m1Var.f60289x;
        if (z10 && m1Var.f60290y == null) {
            this.f60260a = 2;
        }
        int i10 = this.f60260a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i7 & 2) == 0 && i10 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f60290y.getClass();
            hVar.addFlag(1);
            hVar.f18224e = 0L;
            if ((i7 & 4) == 0) {
                hVar.b(m1Var.E);
                hVar.f18223c.put(m1Var.f60290y, 0, m1Var.E);
            }
            if ((i7 & 1) == 0) {
                this.f60260a = 2;
            }
            return -4;
        } else {
            mVar.f17465c = m1Var.f60287s;
            this.f60260a = 1;
            return -5;
        }
    }

    public final void c() {
        if (!this.f60261b) {
            m1 m1Var = this.f60262c;
            m1Var.f60283e.i(e2.s0.h(m1Var.f60287s.f10759s), m1Var.f60287s, 0, null, 0L);
            this.f60261b = true;
        }
    }

    @Override
    public final boolean h() {
        return this.f60262c.f60289x;
    }

    @Override
    public final int o(long j3) {
        c();
        if (j3 > 0 && this.f60260a != 2) {
            this.f60260a = 2;
            return 1;
        }
        return 0;
    }
}
