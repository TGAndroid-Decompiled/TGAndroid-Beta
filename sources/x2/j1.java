package x2;
public final class j1 implements c1 {
    public int f58377a;
    public boolean f58378b;
    public final l1 f58379c;

    public j1(l1 l1Var) {
        this.f58379c = l1Var;
    }

    @Override
    public final void a() {
        l1 l1Var = this.f58379c;
        if (!l1Var.f58398w) {
            l1Var.f58396r.a();
        }
    }

    public final void b() {
        if (!this.f58378b) {
            l1 l1Var = this.f58379c;
            l1Var.f58393e.j(e2.s0.h(l1Var.f58397s.f10615s), l1Var.f58397s, 0, null, 0L);
            this.f58378b = true;
        }
    }

    @Override
    public final boolean f() {
        return this.f58379c.f58399x;
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
        l1 l1Var = this.f58379c;
        boolean z9 = l1Var.f58399x;
        if (z9 && l1Var.f58400y == null) {
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
            l1Var.f58400y.getClass();
            hVar.addFlag(1);
            hVar.f17176e = 0L;
            if ((i7 & 4) == 0) {
                hVar.b(l1Var.D);
                hVar.f17175c.put(l1Var.f58400y, 0, l1Var.D);
            }
            if ((i7 & 1) == 0) {
                this.f58377a = 2;
            }
            return -4;
        } else {
            bVar.f57668c = l1Var.f58397s;
            this.f58377a = 1;
            return -5;
        }
    }
}
