package u2;
public final class i1 implements b1 {
    public int f43419a;
    public boolean f43420b;
    public final k1 f43421c;

    public i1(k1 k1Var) {
        this.f43421c = k1Var;
    }

    @Override
    public final void a() {
        k1 k1Var = this.f43421c;
        if (!k1Var.v) {
            k1Var.f43438r.a();
        }
    }

    public final void b() {
        if (!this.f43420b) {
            k1 k1Var = this.f43421c;
            k1Var.e.k(b2.r0.h(k1Var.f43439s.f3309r), k1Var.f43439s, 0, null, 0L);
            this.f43420b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f43421c.f43440w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        k1 k1Var = this.f43421c;
        boolean z10 = k1Var.f43440w;
        if (z10 && k1Var.f43441x == null) {
            this.f43419a = 2;
        }
        int i11 = this.f43419a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            k1Var.f43441x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(k1Var.f43442y);
                hVar.f10097c.put(k1Var.f43441x, 0, k1Var.f43442y);
            }
            if ((i10 & 1) == 0) {
                this.f43419a = 2;
            }
            return -4;
        } else {
            yVar.f15005c = k1Var.f43439s;
            this.f43419a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f43419a != 2) {
            this.f43419a = 2;
            return 1;
        }
        return 0;
    }
}
