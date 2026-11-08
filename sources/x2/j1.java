package x2;
public final class j1 implements c1 {
    public int f58367a;
    public boolean f58368b;
    public final l1 f58369c;

    public j1(l1 l1Var) {
        this.f58369c = l1Var;
    }

    @Override
    public final void a() {
        l1 l1Var = this.f58369c;
        if (!l1Var.f58388w) {
            l1Var.f58386r.a();
        }
    }

    public final void b() {
        if (!this.f58368b) {
            l1 l1Var = this.f58369c;
            l1Var.f58383e.j(e2.s0.h(l1Var.f58387s.f10615s), l1Var.f58387s, 0, null, 0L);
            this.f58368b = true;
        }
    }

    @Override
    public final boolean f() {
        return this.f58369c.f58389x;
    }

    @Override
    public final int l(long j3) {
        b();
        if (j3 > 0 && this.f58367a != 2) {
            this.f58367a = 2;
            return 1;
        }
        return 0;
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        b();
        l1 l1Var = this.f58369c;
        boolean z9 = l1Var.f58389x;
        if (z9 && l1Var.f58390y == null) {
            this.f58367a = 2;
        }
        int i10 = this.f58367a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i7 & 2) == 0 && i10 != 0) {
            if (!z9) {
                return -3;
            }
            l1Var.f58390y.getClass();
            hVar.addFlag(1);
            hVar.f17176e = 0L;
            if ((i7 & 4) == 0) {
                hVar.b(l1Var.D);
                hVar.f17175c.put(l1Var.f58390y, 0, l1Var.D);
            }
            if ((i7 & 1) == 0) {
                this.f58367a = 2;
            }
            return -4;
        } else {
            bVar.f57655c = l1Var.f58387s;
            this.f58367a = 1;
            return -5;
        }
    }
}
