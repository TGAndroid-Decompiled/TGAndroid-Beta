package u2;
public final class i1 implements b1 {
    public int f43387a;
    public boolean f43388b;
    public final k1 f43389c;

    public i1(k1 k1Var) {
        this.f43389c = k1Var;
    }

    @Override
    public final void a() {
        k1 k1Var = this.f43389c;
        if (!k1Var.v) {
            k1Var.f43406r.a();
        }
    }

    public final void b() {
        if (!this.f43388b) {
            k1 k1Var = this.f43389c;
            k1Var.e.k(b2.r0.h(k1Var.f43407s.f3306r), k1Var.f43407s, 0, null, 0L);
            this.f43388b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f43389c.f43408w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        k1 k1Var = this.f43389c;
        boolean z10 = k1Var.f43408w;
        if (z10 && k1Var.f43409x == null) {
            this.f43387a = 2;
        }
        int i11 = this.f43387a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            k1Var.f43409x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(k1Var.f43410y);
                hVar.f10093c.put(k1Var.f43409x, 0, k1Var.f43410y);
            }
            if ((i10 & 1) == 0) {
                this.f43387a = 2;
            }
            return -4;
        } else {
            yVar.f14993c = k1Var.f43407s;
            this.f43387a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f43387a != 2) {
            this.f43387a = 2;
            return 1;
        }
        return 0;
    }
}
