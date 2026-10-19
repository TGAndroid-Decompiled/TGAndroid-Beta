package u2;
public final class k1 implements d1 {
    public int f47343a;
    public boolean f47344b;
    public final m1 f47345c;

    public k1(m1 m1Var) {
        this.f47345c = m1Var;
    }

    @Override
    public final void a() {
        m1 m1Var = this.f47345c;
        if (!m1Var.v) {
            m1Var.f47368r.a();
        }
    }

    public final void b() {
        if (!this.f47344b) {
            m1 m1Var = this.f47345c;
            m1Var.e.m(b2.v0.h(m1Var.f47369s.f4130s), m1Var.f47369s, 0, null, 0L);
            this.f47344b = true;
        }
    }

    @Override
    public final boolean f() {
        return this.f47345c.f47370w;
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        b();
        m1 m1Var = this.f47345c;
        boolean z10 = m1Var.f47370w;
        if (z10 && m1Var.f47371x == null) {
            this.f47343a = 2;
        }
        int i11 = this.f47343a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f47371x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(m1Var.f47372y);
                hVar.f11636c.put(m1Var.f47371x, 0, m1Var.f47372y);
            }
            if ((i10 & 1) == 0) {
                this.f47343a = 2;
            }
            return -4;
        } else {
            bVar.f44438c = m1Var.f47369s;
            this.f47343a = 1;
            return -5;
        }
    }

    @Override
    public final int m(long j10) {
        b();
        if (j10 > 0 && this.f47343a != 2) {
            this.f47343a = 2;
            return 1;
        }
        return 0;
    }
}
