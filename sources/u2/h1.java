package u2;
public final class h1 implements a1 {
    public int f48811a;
    public boolean f48812b;
    public final j1 f48813c;

    public h1(j1 j1Var) {
        this.f48813c = j1Var;
    }

    @Override
    public final void a() {
        j1 j1Var = this.f48813c;
        if (!j1Var.v) {
            j1Var.f48830r.a();
        }
    }

    public final void b() {
        if (!this.f48812b) {
            j1 j1Var = this.f48813c;
            j1Var.f48827e.l(b2.r0.h(j1Var.f48831s.f3641r), j1Var.f48831s, 0, null, 0L);
            this.f48812b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f48813c.f48832w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        j1 j1Var = this.f48813c;
        boolean z10 = j1Var.f48832w;
        if (z10 && j1Var.f48833x == null) {
            this.f48811a = 2;
        }
        int i11 = this.f48811a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            j1Var.f48833x.getClass();
            hVar.addFlag(1);
            hVar.f10984e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(j1Var.f48834y);
                hVar.f10983c.put(j1Var.f48833x, 0, j1Var.f48834y);
            }
            if ((i10 & 1) == 0) {
                this.f48811a = 2;
            }
            return -4;
        } else {
            yVar.f16363c = j1Var.f48831s;
            this.f48811a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f48811a != 2) {
            this.f48811a = 2;
            return 1;
        }
        return 0;
    }
}
