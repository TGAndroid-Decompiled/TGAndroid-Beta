package x2;
public final class k1 implements d1 {
    public int f60142a;
    public boolean f60143b;
    public final m1 f60144c;

    public k1(m1 m1Var) {
        this.f60144c = m1Var;
    }

    @Override
    public final void a() {
        m1 m1Var = this.f60144c;
        if (!m1Var.f60170w) {
            m1Var.f60168r.a();
        }
    }

    public final void b() {
        if (!this.f60143b) {
            m1 m1Var = this.f60144c;
            m1Var.f60165e.j(e2.s0.h(m1Var.f60169s.f10761s), m1Var.f60169s, 0, null, 0L);
            this.f60143b = true;
        }
    }

    @Override
    public final boolean h() {
        return this.f60144c.f60171x;
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f60142a != 2) {
            this.f60142a = 2;
            return 1;
        }
        return 0;
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        b();
        m1 m1Var = this.f60144c;
        boolean z10 = m1Var.f60171x;
        if (z10 && m1Var.f60172y == null) {
            this.f60142a = 2;
        }
        int i10 = this.f60142a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i7 & 2) == 0 && i10 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f60172y.getClass();
            hVar.addFlag(1);
            hVar.f18122e = 0L;
            if ((i7 & 4) == 0) {
                hVar.b(m1Var.E);
                hVar.f18121c.put(m1Var.f60172y, 0, m1Var.E);
            }
            if ((i7 & 1) == 0) {
                this.f60142a = 2;
            }
            return -4;
        } else {
            aVar.f18178c = m1Var.f60169s;
            this.f60142a = 1;
            return -5;
        }
    }
}
