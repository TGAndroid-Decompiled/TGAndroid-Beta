package u2;
public final class j1 implements c1 {
    public int f47386a;
    public boolean f47387b;
    public final l1 f47388c;

    public j1(l1 l1Var) {
        this.f47388c = l1Var;
    }

    @Override
    public final void a() {
        l1 l1Var = this.f47388c;
        if (!l1Var.v) {
            l1Var.f47411r.a();
        }
    }

    public final void b() {
        if (!this.f47387b) {
            l1 l1Var = this.f47388c;
            l1Var.e.m(b2.v0.h(l1Var.f47412s.f4132s), l1Var.f47412s, 0, null, 0L);
            this.f47387b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f47388c.f47413w;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        b();
        l1 l1Var = this.f47388c;
        boolean z10 = l1Var.f47413w;
        if (z10 && l1Var.f47414x == null) {
            this.f47386a = 2;
        }
        int i11 = this.f47386a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            l1Var.f47414x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(l1Var.f47415y);
                hVar.f11637c.put(l1Var.f47414x, 0, l1Var.f47415y);
            }
            if ((i10 & 1) == 0) {
                this.f47386a = 2;
            }
            return -4;
        } else {
            bVar.f44486c = l1Var.f47412s;
            this.f47386a = 1;
            return -5;
        }
    }

    @Override
    public final int h(long j10) {
        b();
        if (j10 > 0 && this.f47386a != 2) {
            this.f47386a = 2;
            return 1;
        }
        return 0;
    }
}
