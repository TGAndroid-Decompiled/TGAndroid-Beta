package u2;
public final class h1 implements a1 {
    public int f48670a;
    public boolean f48671b;
    public final j1 f48672c;

    public h1(j1 j1Var) {
        this.f48672c = j1Var;
    }

    @Override
    public final void a() {
        j1 j1Var = this.f48672c;
        if (!j1Var.v) {
            j1Var.f48689r.a();
        }
    }

    public final void b() {
        if (!this.f48671b) {
            j1 j1Var = this.f48672c;
            j1Var.f48686e.l(b2.r0.h(j1Var.f48690s.f3643r), j1Var.f48690s, 0, null, 0L);
            this.f48671b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f48672c.f48691w;
    }

    @Override
    public final int f(n4.x xVar, h2.h hVar, int i10) {
        b();
        j1 j1Var = this.f48672c;
        boolean z10 = j1Var.f48691w;
        if (z10 && j1Var.f48692x == null) {
            this.f48670a = 2;
        }
        int i11 = this.f48670a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            j1Var.f48692x.getClass();
            hVar.addFlag(1);
            hVar.f10985e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(j1Var.f48693y);
                hVar.f10984c.put(j1Var.f48692x, 0, j1Var.f48693y);
            }
            if ((i10 & 1) == 0) {
                this.f48670a = 2;
            }
            return -4;
        } else {
            xVar.f16659c = j1Var.f48690s;
            this.f48670a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f48670a != 2) {
            this.f48670a = 2;
            return 1;
        }
        return 0;
    }
}
