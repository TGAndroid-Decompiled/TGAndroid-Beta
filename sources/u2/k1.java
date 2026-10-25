package u2;
public final class k1 implements d1 {
    public int f49336a;
    public boolean f49337b;
    public final m1 f49338c;

    public k1(m1 m1Var) {
        this.f49338c = m1Var;
    }

    public final void a() {
        if (!this.f49337b) {
            m1 m1Var = this.f49338c;
            m1Var.e.l(b2.w0.h(m1Var.f49361s.f3586s), m1Var.f49361s, 0, null, 0L);
            this.f49337b = true;
        }
    }

    @Override
    public final void d() {
        m1 m1Var = this.f49338c;
        if (!m1Var.v) {
            m1Var.f49360r.d();
        }
    }

    @Override
    public final boolean e() {
        return this.f49338c.f49362w;
    }

    @Override
    public final int f(n4.s sVar, h2.h hVar, int i10) {
        a();
        m1 m1Var = this.f49338c;
        boolean z10 = m1Var.f49362w;
        if (z10 && m1Var.f49363x == null) {
            this.f49336a = 2;
        }
        int i11 = this.f49336a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f49363x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(m1Var.f49364y);
                hVar.f12570c.put(m1Var.f49363x, 0, m1Var.f49364y);
            }
            if ((i10 & 1) == 0) {
                this.f49336a = 2;
            }
            return -4;
        } else {
            sVar.f18697c = m1Var.f49361s;
            this.f49336a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j10) {
        a();
        if (j10 > 0 && this.f49336a != 2) {
            this.f49336a = 2;
            return 1;
        }
        return 0;
    }
}
