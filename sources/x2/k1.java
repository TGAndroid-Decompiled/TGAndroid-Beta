package x2;
public final class k1 implements d1 {
    public int f60132a;
    public boolean f60133b;
    public final m1 f60134c;

    public k1(m1 m1Var) {
        this.f60134c = m1Var;
    }

    @Override
    public final void a() {
        m1 m1Var = this.f60134c;
        if (!m1Var.f60160w) {
            m1Var.f60158r.a();
        }
    }

    public final void b() {
        if (!this.f60133b) {
            m1 m1Var = this.f60134c;
            m1Var.f60155e.j(e2.s0.h(m1Var.f60159s.f10766s), m1Var.f60159s, 0, null, 0L);
            this.f60133b = true;
        }
    }

    @Override
    public final boolean h() {
        return this.f60134c.f60161x;
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f60132a != 2) {
            this.f60132a = 2;
            return 1;
        }
        return 0;
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        b();
        m1 m1Var = this.f60134c;
        boolean z10 = m1Var.f60161x;
        if (z10 && m1Var.f60162y == null) {
            this.f60132a = 2;
        }
        int i10 = this.f60132a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i7 & 2) == 0 && i10 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f60162y.getClass();
            hVar.addFlag(1);
            hVar.f18125e = 0L;
            if ((i7 & 4) == 0) {
                hVar.b(m1Var.E);
                hVar.f18124c.put(m1Var.f60162y, 0, m1Var.E);
            }
            if ((i7 & 1) == 0) {
                this.f60132a = 2;
            }
            return -4;
        } else {
            aVar.f18181c = m1Var.f60159s;
            this.f60132a = 1;
            return -5;
        }
    }
}
