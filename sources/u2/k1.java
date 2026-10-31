package u2;
public final class k1 implements d1 {
    public int f49917a;
    public boolean f49918b;
    public final m1 f49919c;

    public k1(m1 m1Var) {
        this.f49919c = m1Var;
    }

    @Override
    public final void a() {
        m1 m1Var = this.f49919c;
        if (!m1Var.f49943w) {
            m1Var.f49941r.a();
        }
    }

    public final void b() {
        if (!this.f49918b) {
            m1 m1Var = this.f49919c;
            m1Var.e.l(b2.v0.h(m1Var.f49942s.f2423s), m1Var.f49942s, 0, null, 0L);
            this.f49918b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f49919c.f49944x;
    }

    @Override
    public final int i(long j10) {
        b();
        if (j10 > 0 && this.f49917a != 2) {
            this.f49917a = 2;
            return 1;
        }
        return 0;
    }

    @Override
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        b();
        m1 m1Var = this.f49919c;
        boolean z10 = m1Var.f49944x;
        if (z10 && m1Var.f49945y == null) {
            this.f49917a = 2;
        }
        int i11 = this.f49917a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f49945y.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.c(m1Var.D);
                hVar.f7586c.put(m1Var.f49945y, 0, m1Var.D);
            }
            if ((i10 & 1) == 0) {
                this.f49917a = 2;
            }
            return -4;
        } else {
            bVar.f7658c = m1Var.f49942s;
            this.f49917a = 1;
            return -5;
        }
    }
}
