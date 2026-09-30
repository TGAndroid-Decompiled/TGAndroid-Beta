package u2;
public final class i1 implements b1 {
    public int f43782a;
    public boolean f43783b;
    public final k1 f43784c;

    public i1(k1 k1Var) {
        this.f43784c = k1Var;
    }

    @Override
    public final void a() {
        k1 k1Var = this.f43784c;
        if (!k1Var.v) {
            k1Var.f43801r.a();
        }
    }

    public final void b() {
        if (!this.f43783b) {
            k1 k1Var = this.f43784c;
            k1Var.e.k(b2.r0.h(k1Var.f43802s.f3308r), k1Var.f43802s, 0, null, 0L);
            this.f43783b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f43784c.f43803w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        k1 k1Var = this.f43784c;
        boolean z10 = k1Var.f43803w;
        if (z10 && k1Var.f43804x == null) {
            this.f43782a = 2;
        }
        int i11 = this.f43782a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            k1Var.f43804x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(k1Var.f43805y);
                hVar.f10092c.put(k1Var.f43804x, 0, k1Var.f43805y);
            }
            if ((i10 & 1) == 0) {
                this.f43782a = 2;
            }
            return -4;
        } else {
            yVar.f15239c = k1Var.f43802s;
            this.f43782a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f43782a != 2) {
            this.f43782a = 2;
            return 1;
        }
        return 0;
    }
}
