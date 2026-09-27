package u2;
public final class i1 implements b1 {
    public int f43720a;
    public boolean f43721b;
    public final k1 f43722c;

    public i1(k1 k1Var) {
        this.f43722c = k1Var;
    }

    @Override
    public final void a() {
        k1 k1Var = this.f43722c;
        if (!k1Var.v) {
            k1Var.f43739r.a();
        }
    }

    public final void b() {
        if (!this.f43721b) {
            k1 k1Var = this.f43722c;
            k1Var.e.k(b2.r0.h(k1Var.f43740s.f3303r), k1Var.f43740s, 0, null, 0L);
            this.f43721b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f43722c.f43741w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        k1 k1Var = this.f43722c;
        boolean z10 = k1Var.f43741w;
        if (z10 && k1Var.f43742x == null) {
            this.f43720a = 2;
        }
        int i11 = this.f43720a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            k1Var.f43742x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(k1Var.f43743y);
                hVar.f10084c.put(k1Var.f43742x, 0, k1Var.f43743y);
            }
            if ((i10 & 1) == 0) {
                this.f43720a = 2;
            }
            return -4;
        } else {
            yVar.f15258c = k1Var.f43740s;
            this.f43720a = 1;
            return -5;
        }
    }

    @Override
    public final int h(long j3) {
        b();
        if (j3 > 0 && this.f43720a != 2) {
            this.f43720a = 2;
            return 1;
        }
        return 0;
    }
}
