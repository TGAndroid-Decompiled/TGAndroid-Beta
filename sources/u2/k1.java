package u2;
public final class k1 implements d1 {
    public int f47345a;
    public boolean f47346b;
    public final m1 f47347c;

    public k1(m1 m1Var) {
        this.f47347c = m1Var;
    }

    @Override
    public final void a() {
        m1 m1Var = this.f47347c;
        if (!m1Var.v) {
            m1Var.f47370r.a();
        }
    }

    public final void b() {
        if (!this.f47346b) {
            m1 m1Var = this.f47347c;
            m1Var.e.m(b2.v0.h(m1Var.f47371s.f4128s), m1Var.f47371s, 0, null, 0L);
            this.f47346b = true;
        }
    }

    @Override
    public final boolean f() {
        return this.f47347c.f47372w;
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        b();
        m1 m1Var = this.f47347c;
        boolean z10 = m1Var.f47372w;
        if (z10 && m1Var.f47373x == null) {
            this.f47345a = 2;
        }
        int i11 = this.f47345a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f47373x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(m1Var.f47374y);
                hVar.f11634c.put(m1Var.f47373x, 0, m1Var.f47374y);
            }
            if ((i10 & 1) == 0) {
                this.f47345a = 2;
            }
            return -4;
        } else {
            bVar.f44440c = m1Var.f47371s;
            this.f47345a = 1;
            return -5;
        }
    }

    @Override
    public final int m(long j10) {
        b();
        if (j10 > 0 && this.f47345a != 2) {
            this.f47345a = 2;
            return 1;
        }
        return 0;
    }
}
