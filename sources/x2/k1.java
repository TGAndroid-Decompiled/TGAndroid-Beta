package x2;
public final class k1 implements d1 {
    public int f60131a;
    public boolean f60132b;
    public final m1 f60133c;

    public k1(m1 m1Var) {
        this.f60133c = m1Var;
    }

    @Override
    public final void a() {
        m1 m1Var = this.f60133c;
        if (!m1Var.f60159w) {
            m1Var.f60157r.a();
        }
    }

    public final void b() {
        if (!this.f60132b) {
            m1 m1Var = this.f60133c;
            m1Var.f60154e.j(e2.s0.h(m1Var.f60158s.f10769s), m1Var.f60158s, 0, null, 0L);
            this.f60132b = true;
        }
    }

    @Override
    public final boolean h() {
        return this.f60133c.f60160x;
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f60131a != 2) {
            this.f60131a = 2;
            return 1;
        }
        return 0;
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        b();
        m1 m1Var = this.f60133c;
        boolean z10 = m1Var.f60160x;
        if (z10 && m1Var.f60161y == null) {
            this.f60131a = 2;
        }
        int i10 = this.f60131a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i7 & 2) == 0 && i10 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f60161y.getClass();
            hVar.addFlag(1);
            hVar.f18128e = 0L;
            if ((i7 & 4) == 0) {
                hVar.b(m1Var.E);
                hVar.f18127c.put(m1Var.f60161y, 0, m1Var.E);
            }
            if ((i7 & 1) == 0) {
                this.f60131a = 2;
            }
            return -4;
        } else {
            aVar.f18184c = m1Var.f60158s;
            this.f60131a = 1;
            return -5;
        }
    }
}
