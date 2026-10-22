package u2;
public final class l1 implements e1 {
    public int f47362a;
    public boolean f47363b;
    public final n1 f47364c;

    public l1(n1 n1Var) {
        this.f47364c = n1Var;
    }

    @Override
    public final void a() {
        n1 n1Var = this.f47364c;
        if (!n1Var.v) {
            n1Var.f47386r.a();
        }
    }

    public final void b() {
        if (!this.f47363b) {
            n1 n1Var = this.f47364c;
            n1Var.e.m(b2.v0.h(n1Var.f47387s.f4128s), n1Var.f47387s, 0, null, 0L);
            this.f47363b = true;
        }
    }

    @Override
    public final boolean f() {
        return this.f47364c.f47388w;
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        b();
        n1 n1Var = this.f47364c;
        boolean z10 = n1Var.f47388w;
        if (z10 && n1Var.f47389x == null) {
            this.f47362a = 2;
        }
        int i11 = this.f47362a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            n1Var.f47389x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(n1Var.f47390y);
                hVar.f11634c.put(n1Var.f47389x, 0, n1Var.f47390y);
            }
            if ((i10 & 1) == 0) {
                this.f47362a = 2;
            }
            return -4;
        } else {
            bVar.f44451c = n1Var.f47387s;
            this.f47362a = 1;
            return -5;
        }
    }

    @Override
    public final int m(long j10) {
        b();
        if (j10 > 0 && this.f47362a != 2) {
            this.f47362a = 2;
            return 1;
        }
        return 0;
    }
}
