package u2;
public final class i1 implements b1 {
    public int f43414a;
    public boolean f43415b;
    public final k1 f43416c;

    public i1(k1 k1Var) {
        this.f43416c = k1Var;
    }

    @Override
    public final void a() {
        k1 k1Var = this.f43416c;
        if (!k1Var.v) {
            k1Var.f43433r.a();
        }
    }

    public final void b() {
        if (!this.f43415b) {
            k1 k1Var = this.f43416c;
            k1Var.e.k(b2.r0.h(k1Var.f43434s.f3309r), k1Var.f43434s, 0, null, 0L);
            this.f43415b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f43416c.f43435w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        k1 k1Var = this.f43416c;
        boolean z10 = k1Var.f43435w;
        if (z10 && k1Var.f43436x == null) {
            this.f43414a = 2;
        }
        int i11 = this.f43414a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            k1Var.f43436x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(k1Var.f43437y);
                hVar.f10097c.put(k1Var.f43436x, 0, k1Var.f43437y);
            }
            if ((i10 & 1) == 0) {
                this.f43414a = 2;
            }
            return -4;
        } else {
            yVar.f15005c = k1Var.f43434s;
            this.f43414a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f43414a != 2) {
            this.f43414a = 2;
            return 1;
        }
        return 0;
    }
}
