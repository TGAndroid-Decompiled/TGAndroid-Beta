package u2;
public final class j1 implements c1 {
    public int f43717a;
    public boolean f43718b;
    public final l1 f43719c;

    public j1(l1 l1Var) {
        this.f43719c = l1Var;
    }

    @Override
    public final void a() {
        l1 l1Var = this.f43719c;
        if (!l1Var.v) {
            l1Var.f43735r.a();
        }
    }

    public final void b() {
        if (!this.f43718b) {
            l1 l1Var = this.f43719c;
            l1Var.e.k(b2.r0.h(l1Var.f43736s.f3308r), l1Var.f43736s, 0, null, 0L);
            this.f43718b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f43719c.f43737w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        l1 l1Var = this.f43719c;
        boolean z10 = l1Var.f43737w;
        if (z10 && l1Var.f43738x == null) {
            this.f43717a = 2;
        }
        int i11 = this.f43717a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            l1Var.f43738x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.c(l1Var.f43739y);
                hVar.f10097c.put(l1Var.f43738x, 0, l1Var.f43739y);
            }
            if ((i10 & 1) == 0) {
                this.f43717a = 2;
            }
            return -4;
        } else {
            yVar.f15231b = l1Var.f43736s;
            this.f43717a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f43717a != 2) {
            this.f43717a = 2;
            return 1;
        }
        return 0;
    }
}
