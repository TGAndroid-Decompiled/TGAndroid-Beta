package u2;
public final class k1 implements d1 {
    public int f42367a;
    public boolean f42368b;
    public final m1 f42369c;

    public k1(m1 m1Var) {
        this.f42369c = m1Var;
    }

    @Override
    public final void a() {
        m1 m1Var = this.f42369c;
        if (!m1Var.v) {
            m1Var.f42385r.a();
        }
    }

    public final void b() {
        if (!this.f42368b) {
            m1 m1Var = this.f42369c;
            m1Var.e.i(b2.r0.h(m1Var.f42386s.f2002r), m1Var.f42386s, 0, null, 0L);
            this.f42368b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f42369c.f42387w;
    }

    @Override
    public final int g(long j3) {
        b();
        if (j3 > 0 && this.f42367a != 2) {
            this.f42367a = 2;
            return 1;
        }
        return 0;
    }

    @Override
    public final int t(of.b bVar, h2.h hVar, int i10) {
        b();
        m1 m1Var = this.f42369c;
        boolean z10 = m1Var.f42387w;
        if (z10 && m1Var.f42388x == null) {
            this.f42367a = 2;
        }
        int i11 = this.f42367a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f42388x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(m1Var.f42389y);
                hVar.f9210c.put(m1Var.f42388x, 0, m1Var.f42389y);
            }
            if ((i10 & 1) == 0) {
                this.f42367a = 2;
            }
            return -4;
        } else {
            bVar.f14295c = m1Var.f42386s;
            this.f42367a = 1;
            return -5;
        }
    }
}
