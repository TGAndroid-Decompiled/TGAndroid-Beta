package u2;
public final class l1 implements e1 {
    public int f47359a;
    public boolean f47360b;
    public final n1 f47361c;

    public l1(n1 n1Var) {
        this.f47361c = n1Var;
    }

    @Override
    public final void a() {
        n1 n1Var = this.f47361c;
        if (!n1Var.v) {
            n1Var.f47383r.a();
        }
    }

    public final void b() {
        if (!this.f47360b) {
            n1 n1Var = this.f47361c;
            n1Var.e.m(b2.v0.h(n1Var.f47384s.f4128s), n1Var.f47384s, 0, null, 0L);
            this.f47360b = true;
        }
    }

    @Override
    public final boolean f() {
        return this.f47361c.f47385w;
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        b();
        n1 n1Var = this.f47361c;
        boolean z10 = n1Var.f47385w;
        if (z10 && n1Var.f47386x == null) {
            this.f47359a = 2;
        }
        int i11 = this.f47359a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            n1Var.f47386x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(n1Var.f47387y);
                hVar.f11634c.put(n1Var.f47386x, 0, n1Var.f47387y);
            }
            if ((i10 & 1) == 0) {
                this.f47359a = 2;
            }
            return -4;
        } else {
            bVar.f44448c = n1Var.f47384s;
            this.f47359a = 1;
            return -5;
        }
    }

    @Override
    public final int m(long j10) {
        b();
        if (j10 > 0 && this.f47359a != 2) {
            this.f47359a = 2;
            return 1;
        }
        return 0;
    }
}
