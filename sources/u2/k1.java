package u2;
public final class k1 implements d1 {
    public int f45959a;
    public boolean f45960b;
    public final m1 f45961c;

    public k1(m1 m1Var) {
        this.f45961c = m1Var;
    }

    public final void a() {
        if (!this.f45960b) {
            m1 m1Var = this.f45961c;
            m1Var.e.m(b2.w0.h(m1Var.f45985s.f2523s), m1Var.f45985s, 0, null, 0L);
            this.f45960b = true;
        }
    }

    @Override
    public final void b() {
        m1 m1Var = this.f45961c;
        if (!m1Var.v) {
            m1Var.f45984r.b();
        }
    }

    @Override
    public final boolean e() {
        return this.f45961c.f45986w;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        a();
        m1 m1Var = this.f45961c;
        boolean z10 = m1Var.f45986w;
        if (z10 && m1Var.f45987x == null) {
            this.f45959a = 2;
        }
        int i11 = this.f45959a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f45987x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(m1Var.f45988y);
                hVar.f10330c.put(m1Var.f45987x, 0, m1Var.f45988y);
            }
            if ((i10 & 1) == 0) {
                this.f45959a = 2;
            }
            return -4;
        } else {
            bVar.f43098c = m1Var.f45985s;
            this.f45959a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j10) {
        a();
        if (j10 > 0 && this.f45959a != 2) {
            this.f45959a = 2;
            return 1;
        }
        return 0;
    }
}
