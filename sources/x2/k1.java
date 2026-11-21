package x2;
public final class k1 implements d1 {
    public int f60173a;
    public boolean f60174b;
    public final m1 f60175c;

    public k1(m1 m1Var) {
        this.f60175c = m1Var;
    }

    @Override
    public final void a() {
        m1 m1Var = this.f60175c;
        if (!m1Var.f60201w) {
            m1Var.f60199r.a();
        }
    }

    public final void b() {
        if (!this.f60174b) {
            m1 m1Var = this.f60175c;
            m1Var.f60196e.j(e2.s0.h(m1Var.f60200s.f10795s), m1Var.f60200s, 0, null, 0L);
            this.f60174b = true;
        }
    }

    @Override
    public final boolean h() {
        return this.f60175c.f60202x;
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f60173a != 2) {
            this.f60173a = 2;
            return 1;
        }
        return 0;
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        b();
        m1 m1Var = this.f60175c;
        boolean z10 = m1Var.f60202x;
        if (z10 && m1Var.f60203y == null) {
            this.f60173a = 2;
        }
        int i10 = this.f60173a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i7 & 2) == 0 && i10 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f60203y.getClass();
            hVar.addFlag(1);
            hVar.f18156e = 0L;
            if ((i7 & 4) == 0) {
                hVar.b(m1Var.E);
                hVar.f18155c.put(m1Var.f60203y, 0, m1Var.E);
            }
            if ((i7 & 1) == 0) {
                this.f60173a = 2;
            }
            return -4;
        } else {
            aVar.f18212c = m1Var.f60200s;
            this.f60173a = 1;
            return -5;
        }
    }
}
