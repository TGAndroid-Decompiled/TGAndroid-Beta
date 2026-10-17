package u2;
public final class k1 implements d1 {
    public int f47366a;
    public boolean f47367b;
    public final m1 f47368c;

    public k1(m1 m1Var) {
        this.f47368c = m1Var;
    }

    @Override
    public final void a() {
        m1 m1Var = this.f47368c;
        if (!m1Var.v) {
            m1Var.f47391r.a();
        }
    }

    public final void b() {
        if (!this.f47367b) {
            m1 m1Var = this.f47368c;
            m1Var.e.m(b2.v0.h(m1Var.f47392s.f4131s), m1Var.f47392s, 0, null, 0L);
            this.f47367b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f47368c.f47393w;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        b();
        m1 m1Var = this.f47368c;
        boolean z10 = m1Var.f47393w;
        if (z10 && m1Var.f47394x == null) {
            this.f47366a = 2;
        }
        int i11 = this.f47366a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f47394x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(m1Var.f47395y);
                hVar.f11635c.put(m1Var.f47394x, 0, m1Var.f47395y);
            }
            if ((i10 & 1) == 0) {
                this.f47366a = 2;
            }
            return -4;
        } else {
            bVar.f44466c = m1Var.f47392s;
            this.f47366a = 1;
            return -5;
        }
    }

    @Override
    public final int h(long j10) {
        b();
        if (j10 > 0 && this.f47366a != 2) {
            this.f47366a = 2;
            return 1;
        }
        return 0;
    }
}
