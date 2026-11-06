package x2;
public final class j1 implements c1 {
    public int f58273a;
    public boolean f58274b;
    public final l1 f58275c;

    public j1(l1 l1Var) {
        this.f58275c = l1Var;
    }

    @Override
    public final void a() {
        l1 l1Var = this.f58275c;
        if (!l1Var.f58294w) {
            l1Var.f58292r.a();
        }
    }

    public final void b() {
        if (!this.f58274b) {
            l1 l1Var = this.f58275c;
            l1Var.f58289e.j(e2.s0.h(l1Var.f58293s.f10615s), l1Var.f58293s, 0, null, 0L);
            this.f58274b = true;
        }
    }

    @Override
    public final boolean f() {
        return this.f58275c.f58295x;
    }

    @Override
    public final int l(long j3) {
        b();
        if (j3 > 0 && this.f58273a != 2) {
            this.f58273a = 2;
            return 1;
        }
        return 0;
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        b();
        l1 l1Var = this.f58275c;
        boolean z9 = l1Var.f58295x;
        if (z9 && l1Var.f58296y == null) {
            this.f58273a = 2;
        }
        int i10 = this.f58273a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i7 & 2) == 0 && i10 != 0) {
            if (!z9) {
                return -3;
            }
            l1Var.f58296y.getClass();
            hVar.addFlag(1);
            hVar.f17173e = 0L;
            if ((i7 & 4) == 0) {
                hVar.b(l1Var.D);
                hVar.f17172c.put(l1Var.f58296y, 0, l1Var.D);
            }
            if ((i7 & 1) == 0) {
                this.f58273a = 2;
            }
            return -4;
        } else {
            bVar.f57564c = l1Var.f58293s;
            this.f58273a = 1;
            return -5;
        }
    }
}
