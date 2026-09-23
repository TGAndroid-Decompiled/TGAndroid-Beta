package u2;
public final class h1 implements a1 {
    public int f43315a;
    public boolean f43316b;
    public final j1 f43317c;

    public h1(j1 j1Var) {
        this.f43317c = j1Var;
    }

    @Override
    public final void a() {
        j1 j1Var = this.f43317c;
        if (!j1Var.v) {
            j1Var.f43333r.a();
        }
    }

    public final void b() {
        if (!this.f43316b) {
            j1 j1Var = this.f43317c;
            j1Var.e.k(b2.r0.h(j1Var.f43334s.f3301r), j1Var.f43334s, 0, null, 0L);
            this.f43316b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f43317c.f43335w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        j1 j1Var = this.f43317c;
        boolean z10 = j1Var.f43335w;
        if (z10 && j1Var.f43336x == null) {
            this.f43315a = 2;
        }
        int i11 = this.f43315a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            j1Var.f43336x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(j1Var.f43337y);
                hVar.f10079c.put(j1Var.f43336x, 0, j1Var.f43337y);
            }
            if ((i10 & 1) == 0) {
                this.f43315a = 2;
            }
            return -4;
        } else {
            yVar.f14970c = j1Var.f43334s;
            this.f43315a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f43315a != 2) {
            this.f43315a = 2;
            return 1;
        }
        return 0;
    }
}
