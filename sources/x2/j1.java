package x2;
public final class j1 implements c1 {
    public int f58368a;
    public boolean f58369b;
    public final l1 f58370c;

    public j1(l1 l1Var) {
        this.f58370c = l1Var;
    }

    @Override
    public final void a() {
        l1 l1Var = this.f58370c;
        if (!l1Var.f58389w) {
            l1Var.f58387r.a();
        }
    }

    public final void b() {
        if (!this.f58369b) {
            l1 l1Var = this.f58370c;
            l1Var.f58384e.j(e2.s0.h(l1Var.f58388s.f10615s), l1Var.f58388s, 0, null, 0L);
            this.f58369b = true;
        }
    }

    @Override
    public final boolean f() {
        return this.f58370c.f58390x;
    }

    @Override
    public final int l(long j3) {
        b();
        if (j3 > 0 && this.f58368a != 2) {
            this.f58368a = 2;
            return 1;
        }
        return 0;
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        b();
        l1 l1Var = this.f58370c;
        boolean z9 = l1Var.f58390x;
        if (z9 && l1Var.f58391y == null) {
            this.f58368a = 2;
        }
        int i10 = this.f58368a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i7 & 2) == 0 && i10 != 0) {
            if (!z9) {
                return -3;
            }
            l1Var.f58391y.getClass();
            hVar.addFlag(1);
            hVar.f17176e = 0L;
            if ((i7 & 4) == 0) {
                hVar.b(l1Var.D);
                hVar.f17175c.put(l1Var.f58391y, 0, l1Var.D);
            }
            if ((i7 & 1) == 0) {
                this.f58368a = 2;
            }
            return -4;
        } else {
            bVar.f57656c = l1Var.f58388s;
            this.f58368a = 1;
            return -5;
        }
    }
}
