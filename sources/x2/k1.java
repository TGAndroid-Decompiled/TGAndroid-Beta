package x2;
public final class k1 implements d1 {
    public int f60177a;
    public boolean f60178b;
    public final m1 f60179c;

    public k1(m1 m1Var) {
        this.f60179c = m1Var;
    }

    @Override
    public final void a() {
        m1 m1Var = this.f60179c;
        if (!m1Var.f60205w) {
            m1Var.f60203r.a();
        }
    }

    public final void b() {
        if (!this.f60178b) {
            m1 m1Var = this.f60179c;
            m1Var.f60200e.j(e2.s0.h(m1Var.f60204s.f10798s), m1Var.f60204s, 0, null, 0L);
            this.f60178b = true;
        }
    }

    @Override
    public final boolean h() {
        return this.f60179c.f60206x;
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f60177a != 2) {
            this.f60177a = 2;
            return 1;
        }
        return 0;
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        b();
        m1 m1Var = this.f60179c;
        boolean z10 = m1Var.f60206x;
        if (z10 && m1Var.f60207y == null) {
            this.f60177a = 2;
        }
        int i10 = this.f60177a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i7 & 2) == 0 && i10 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f60207y.getClass();
            hVar.addFlag(1);
            hVar.f18159e = 0L;
            if ((i7 & 4) == 0) {
                hVar.b(m1Var.E);
                hVar.f18158c.put(m1Var.f60207y, 0, m1Var.E);
            }
            if ((i7 & 1) == 0) {
                this.f60177a = 2;
            }
            return -4;
        } else {
            aVar.f18215c = m1Var.f60204s;
            this.f60177a = 1;
            return -5;
        }
    }
}
