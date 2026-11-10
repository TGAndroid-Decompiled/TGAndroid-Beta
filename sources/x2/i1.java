package x2;
public final class i1 implements b1 {
    public int f58377a;
    public boolean f58378b;
    public final k1 f58379c;

    public i1(k1 k1Var) {
        this.f58379c = k1Var;
    }

    @Override
    public final void a() {
        k1 k1Var = this.f58379c;
        if (!k1Var.f58399w) {
            k1Var.f58397r.a();
        }
    }

    public final void b() {
        if (!this.f58378b) {
            k1 k1Var = this.f58379c;
            k1Var.f58394e.j(e2.s0.h(k1Var.f58398s.f10620s), k1Var.f58398s, 0, null, 0L);
            this.f58378b = true;
        }
    }

    @Override
    public final boolean f() {
        return this.f58379c.f58400x;
    }

    @Override
    public final int l(long j3) {
        b();
        if (j3 > 0 && this.f58377a != 2) {
            this.f58377a = 2;
            return 1;
        }
        return 0;
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        b();
        k1 k1Var = this.f58379c;
        boolean z9 = k1Var.f58400x;
        if (z9 && k1Var.f58401y == null) {
            this.f58377a = 2;
        }
        int i10 = this.f58377a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i7 & 2) == 0 && i10 != 0) {
            if (!z9) {
                return -3;
            }
            k1Var.f58401y.getClass();
            hVar.addFlag(1);
            hVar.f17176e = 0L;
            if ((i7 & 4) == 0) {
                hVar.b(k1Var.D);
                hVar.f17175c.put(k1Var.f58401y, 0, k1Var.D);
            }
            if ((i7 & 1) == 0) {
                this.f58377a = 2;
            }
            return -4;
        } else {
            bVar.f57667c = k1Var.f58398s;
            this.f58377a = 1;
            return -5;
        }
    }
}
