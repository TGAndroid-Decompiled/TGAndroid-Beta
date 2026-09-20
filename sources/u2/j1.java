package u2;
public final class j1 implements c1 {
    public int f43696a;
    public boolean f43697b;
    public final l1 f43698c;

    public j1(l1 l1Var) {
        this.f43698c = l1Var;
    }

    @Override
    public final void a() {
        l1 l1Var = this.f43698c;
        if (!l1Var.v) {
            l1Var.f43714r.a();
        }
    }

    public final void b() {
        if (!this.f43697b) {
            l1 l1Var = this.f43698c;
            l1Var.e.k(b2.r0.h(l1Var.f43715s.f3309r), l1Var.f43715s, 0, null, 0L);
            this.f43697b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f43698c.f43716w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        l1 l1Var = this.f43698c;
        boolean z10 = l1Var.f43716w;
        if (z10 && l1Var.f43717x == null) {
            this.f43696a = 2;
        }
        int i11 = this.f43696a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            l1Var.f43717x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(l1Var.f43718y);
                hVar.f10097c.put(l1Var.f43717x, 0, l1Var.f43718y);
            }
            if ((i10 & 1) == 0) {
                this.f43696a = 2;
            }
            return -4;
        } else {
            yVar.f15218b = l1Var.f43715s;
            this.f43696a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f43696a != 2) {
            this.f43696a = 2;
            return 1;
        }
        return 0;
    }
}
